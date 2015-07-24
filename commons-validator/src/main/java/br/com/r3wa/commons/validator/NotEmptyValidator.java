package br.com.r3wa.commons.validator;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotEmptyValidator implements ConstraintValidator<NotEmpty, String> {


	@Override
	public void initialize(NotEmpty constraintAnnotation) {
	}



	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value != null ? isNotBlank(value) : true;
	}


}
