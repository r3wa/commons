package br.com.r3wa.commons.validator;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.collections.CollectionUtils.isNotEmpty;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public class ValidatorEntity {



	private static Validator validator;



	static{
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}


	// TODO: subimos o nivel do objeto a ser validado a fim de validar o resquest do ws shimpent via beans validation
	// entao como esse mecanismo podermos validar qualquer entrada iremos remover daqui do domain
	public static void validate(Object object) {

		 Set<ConstraintViolation<Object>> constraints = validator.validate(object);

		if(isNotEmpty(constraints)){
			throw new R3WACommonsValidationException(violation(constraints));
		}
	}







	private static <T extends Object> List<String> violation(Set<ConstraintViolation<T>> constraints) {
		return constraints
				.stream()
				.map(c -> c.getPropertyPath() + " -> " + c.getMessage())
				.sorted()
				.collect(toList());
	}



































}
