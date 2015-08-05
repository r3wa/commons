package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CNPJAdapterTest {



	private IEAdapter ieAdapter;




	@Before
	public void setUp() throws Exception {
		ieAdapter = new IEAdapter();
	}




	@Test
	public void shouldReturnTheValueOFIE() throws Exception {
		 assertThat(ieAdapter.unmarshal("IE"), equalTo("IE"));
		 assertThat(ieAdapter.unmarshal("ISENTO"), equalTo("ISENTO"));
		 assertThat(ieAdapter.unmarshal(null), nullValue());
	}




	@Test
	public void shouldReturnEmptyWhenTheValueIsISENTO() throws Exception {
		assertThat(ieAdapter.marshal("ISENTO"), nullValue());
	}


	@Test
	public void shouldReturnValueWhenTheValueIsntISENTO() throws Exception {
		assertThat(ieAdapter.marshal("IE"), equalTo("IE"));
	}


}
