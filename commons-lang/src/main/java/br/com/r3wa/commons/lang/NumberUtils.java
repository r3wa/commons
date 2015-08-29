package br.com.r3wa.commons.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtils {




	public static BigInteger toBigInt(long number) {
		return BigInteger.valueOf(number);
	}




	public static BigDecimal toBigDouble(long number) {
		return new BigDecimal(number);
	}




	public static BigDecimal toBigDouble(double number) {
		return new BigDecimal(number);
	}


}
