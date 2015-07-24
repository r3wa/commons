package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FormatMoneyNotEmptyAdapterTest {



	private FormatMoneyNotEmptyAdpater formatMoneyNotEmptyAdapter;



	@Before
	public void setUp() throws Exception {
		formatMoneyNotEmptyAdapter = new FormatMoneyNotEmptyAdpater();
	}



	@Test
	public void shouldUnmarshalTheValueWithTwoDigits() throws Exception {
		 assertThat(formatMoneyNotEmptyAdapter.unmarshal("2.023444"), equalTo(2.02));
		 assertThat(formatMoneyNotEmptyAdapter.unmarshal("0.00"), equalTo(0.00));
		 assertThat(formatMoneyNotEmptyAdapter.unmarshal("0.0"), equalTo(0.00));
	}



	@Test
	public void shouldMarshalTheValueWithTwoDigits() throws Exception {
		assertThat(formatMoneyNotEmptyAdapter.marshal(2.12333), equalTo("2.12"));
		assertThat(formatMoneyNotEmptyAdapter.marshal(2.1), equalTo("2.10"));
		assertThat(formatMoneyNotEmptyAdapter.marshal(0.0), equalTo("0.00"));
	}



	@Test
	public void shouldUnmarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		double value =  formatMoneyNotEmptyAdapter.unmarshal(null);
		assertThat(value, equalTo(0.00));
	}


	@Test
	public void shouldMarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		String value =  formatMoneyNotEmptyAdapter.marshal(null);
		assertThat(value, equalTo("0.00"));
	}



}
