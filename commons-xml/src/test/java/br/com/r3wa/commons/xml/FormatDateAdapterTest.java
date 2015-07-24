package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.r3wa.commons.xml.FormatDateAdpater;

public class FormatDateAdapterTest {





	private FormatDateAdpater formatDateAdpater;





	@Before
	public void setUp() throws Exception {
		formatDateAdpater = new FormatDateAdpater();
	}




	@Test
	public void shouldUnmarshalTheValueInOndeDateUsingThePatternNFe() throws Exception {
		 assertThat(formatDateAdpater.unmarshal("2015-04-19T13:28:54-03:00"), notNullValue());
	}


	@Test
	public void shouldReturnWhenTheValueIsNull() throws Exception {
		assertThat(formatDateAdpater.unmarshal(null), nullValue());
	}




	@Test
	public void shouldMarshalTheValueInOndeDateUsingThePatternNFe() throws Exception {
		assertThat(formatDateAdpater.marshal(new Date()), equalTo(now()));
	}


	@Test
	public void shouldReturnWhenTheDateIsNull() throws Exception {
		assertThat(formatDateAdpater.marshal(null), nullValue());
	}








	private String now() {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX':00'").format(new Date());
	}


}
