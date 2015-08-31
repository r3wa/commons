package br.com.r3wa.commons.validator;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import javax.validation.ConstraintValidator;

import org.junit.Before;
import org.junit.Test;

public class DecimalValidatorTest {



	private ConstraintValidator<Decimal, Double> validator;



	@Before
	public void setUp() throws Exception {
		validator = new DecimalValidator();
	}





	@Test
	public void shoultReturnFalseWhenTheValueIsNull() {
		assertThat(validator.isValid(null, null), not(true));
	}



	@Test
	public void shoultReturnTrueWhenTheValueNotNull() {
		assertThat(validator.isValid(2.2, null), not(false));
	}


	@Test
	public void shoultReturnTrueWhenTheValueZero() {
		assertThat(validator.isValid(0.0, null), not(false));
	}



	@Test
	public void shoultReturnTrueWhenTheValueIsMoreThenZero() {
		assertThat(validator.isValid(0.0001, null), not(false));
	}


	@Test
	public void shoultReturnFalseWhenTheValueIsLessOfZero() {
		assertThat(validator.isValid(-0.1, null), not(true));
	}


}
