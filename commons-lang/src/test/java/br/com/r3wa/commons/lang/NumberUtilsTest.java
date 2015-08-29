package br.com.r3wa.commons.lang;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsTest {




	@Test
	public void shouldCreateOneBigIntByOneLong() {
		assertThat(NumberUtils.toBigInt(1L), equalTo(new BigInteger("1")));
	}


	@Test
	public void shouldCreateOneBigDoubleByOneLong() {
		assertThat(NumberUtils.toBigDouble(1L), equalTo(new BigDecimal(1L)));
	}



}
