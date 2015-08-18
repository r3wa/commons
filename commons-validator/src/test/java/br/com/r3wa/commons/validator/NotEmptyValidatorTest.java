package br.com.r3wa.commons.validator;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import javax.validation.ConstraintValidator;

import org.junit.Before;
import org.junit.Test;

public class NotEmptyValidatorTest {


	private ConstraintValidator<NotEmpty, String> validator;



	@Before
	public void setUp() throws Exception {
		validator = new NotEmptyValidator();
	}



	@Test
	public void shouldReturnTrueWhenStringIsNull() {
		assertThat(validator.isValid(null, null), not(false));
	}

	@Test
	public void shouldReturnTrueWhenStringIsNotNull() {
		assertThat(validator.isValid("Robson", null), not(false));
	}


	@Test
	public void shouldReturnFalseWhenStringIsEmpty1() {
		assertThat(validator.isValid("       ", null), not(true));
	}


	@Test
	public void shouldReturnFalseWhenStringIsEmpty2() {
		assertThat(validator.isValid("", null), not(true));
	}


}
