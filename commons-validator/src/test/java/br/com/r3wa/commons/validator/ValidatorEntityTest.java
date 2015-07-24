package br.com.r3wa.commons.validator;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ValidatorEntityTest {



	@Test
	public void shouldThrowFiscalPacakageCoreValidatorExceptionWhenEntityHaveViolation() {
		try {
			ValidatorEntity.validate(invalidEntity());
		} catch (R3WACommonsValidationException ex) {
			assertThat(ex.violation(), hasSize(4));
		}
	}





	@Test
	public void shouldntThrowFiscalPacakageCoreValidatorExceptionWhenEntityNotHaveViolation() {
		ValidatorEntity.validate(validEntity());
	}


















	private EntityToValidation invalidEntity() {
		return new EntityToValidation(
				"maior que 60 caracters maior que 60 caracters  maior que 60  ",
				"              ",
				null,
				"              "
		);
	}




	private EntityToValidation validEntity() {
		return new EntityToValidation(
				"60 caracteres 60 caracteres60 caracteres60 caracteres60 carc",
				"not blank",
				"not null",
				"nao vazio"
			);
	}




}
