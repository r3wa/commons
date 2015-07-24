package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FormatWeightAdapterTest {



	private FormatWeightAdpater formatWeightAdapter;



	@Before
	public void setUp() throws Exception {
		formatWeightAdapter = new FormatWeightAdpater();
	}



	@Test
	public void shouldUnmarshalTheValueWithTwoDigits() throws Exception {
		 assertThat(formatWeightAdapter.unmarshal("2.023444"), equalTo(2.023));
		 assertThat(formatWeightAdapter.unmarshal("0.000"), equalTo(0.000));
		 assertThat(formatWeightAdapter.unmarshal("0.0"), equalTo(0.000));
	}



	@Test
	public void shouldMarshalTheValueWithTwoDigits() throws Exception {
		assertThat(formatWeightAdapter.marshal(2.12333), equalTo("2.123"));
		assertThat(formatWeightAdapter.marshal(2.1), equalTo("2.100"));
		assertThat(formatWeightAdapter.marshal(0.0), equalTo(null));
	}



	@Test
	public void shouldUnmarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		assertThat(formatWeightAdapter.unmarshal(null), equalTo(0.00));
	}


	@Test
	public void shouldMarshalTheValueWithZerosTwoDigitsWhenValueIsNull() throws Exception {
		assertThat(formatWeightAdapter.marshal(null), equalTo(null));
	}

}
