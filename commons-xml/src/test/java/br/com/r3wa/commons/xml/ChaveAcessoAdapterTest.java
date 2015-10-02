package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChaveAcessoAdapterTest {



	private ChaveAcessoAdapter adapter;




	@Before
	public void setUp() throws Exception {
		adapter = new ChaveAcessoAdapter();
	}




	@Test
	public void shouldReturn() throws Exception {
		 assertThat(adapter.unmarshal("NFe35151002012862000917550060008808021000796729"), equalTo("35151002012862000917550060008808021000796729"));
		 assertThat(adapter.unmarshal("35151002012862000917550060008808021000796729"), equalTo("35151002012862000917550060008808021000796729"));
		 assertThat(adapter.unmarshal(null), nullValue());
	}




	@Test
	public void shouldReturnEmptyWhenTheValueIsISENTO() throws Exception {
		assertThat(adapter.marshal("35151002012862000917550060008808021000796729"), equalTo("35151002012862000917550060008808021000796729"));
	}




}
