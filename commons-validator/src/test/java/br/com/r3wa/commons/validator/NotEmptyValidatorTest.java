package br.com.r3wa.commons.validator;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NotEmptyValidatorTest {

	private NotEmptyValidator notEmptyValidator;



	@Before
	public void setUp() throws Exception {
		notEmptyValidator = new NotEmptyValidator();
	}



	@Test
	public void shouldReturnTrueWhenStringIsNull() {
		assertThat(notEmptyValidator.isValid(null, null), not(false));
	}

	@Test
	public void shouldReturnTrueWhenStringIsNotNull() {
		assertThat(notEmptyValidator.isValid("Robson", null), not(false));
	}


	@Test
	public void shouldReturnFalseWhenStringIsEmpty1() {
		assertThat(notEmptyValidator.isValid("       ", null), not(true));
	}


	@Test
	public void shouldReturnFalseWhenStringIsEmpty2() {
		assertThat(notEmptyValidator.isValid("", null), not(true));
	}


}
