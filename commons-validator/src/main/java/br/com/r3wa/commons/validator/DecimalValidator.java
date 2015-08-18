package br.com.r3wa.commons.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DecimalValidator implements ConstraintValidator<Decimal, Double> {



	@Override
	public void initialize(Decimal constraintAnnotation) {
	}




	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		return value == null ? false : value > 0.0 ? true : false;
	}




}
