package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FormatMoneyEmptyAdapterTest {



	private FormatMoneyEmpytAdpater formatMoneyEmptyAdapter;



	@Before
	public void setUp() throws Exception {
		formatMoneyEmptyAdapter = new FormatMoneyEmpytAdpater();
	}



	@Test
	public void shouldUnmarshalTheValueWithTwoDigits() throws Exception {
		 assertThat(formatMoneyEmptyAdapter.unmarshal("2.023444"), equalTo(2.02));
		 assertThat(formatMoneyEmptyAdapter.unmarshal("0.00"), equalTo(0.00));
		 assertThat(formatMoneyEmptyAdapter.unmarshal("0.0"), equalTo(0.00));
	}



	@Test
	public void shouldMarshalTheValueWithTwoDigits() throws Exception {
		assertThat(formatMoneyEmptyAdapter.marshal(2.12333), equalTo("2.12"));
		assertThat(formatMoneyEmptyAdapter.marshal(2.1), equalTo("2.10"));
		assertThat(formatMoneyEmptyAdapter.marshal(0.0), equalTo(null));
	}



	@Test
	public void shouldUnmarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		assertThat(formatMoneyEmptyAdapter.unmarshal(null), equalTo(0.00));
	}


	@Test
	public void shouldMarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		assertThat(formatMoneyEmptyAdapter.marshal(null), equalTo(null));
	}

}
