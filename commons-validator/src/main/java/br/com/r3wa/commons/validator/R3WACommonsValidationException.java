package br.com.r3wa.commons.validator;

import static org.apache.commons.collections.CollectionUtils.isEmpty;

import java.util.List;

public class R3WACommonsValidationException extends RuntimeException {


	private static final long serialVersionUID = 1L;


	private List<String> violations;


	public R3WACommonsValidationException(List<String> violations) {
		if(isEmpty(violations)){
			throw new IllegalArgumentException("violtaions no be empty");
		}
		this.violations = violations;
	}


	public List<String> violation() {
		return violations;
	}


	@Override
	public String toString() {
		return "FiscalPacakageCoreValidatorException [violations=" + violations + "]";
	}
}
