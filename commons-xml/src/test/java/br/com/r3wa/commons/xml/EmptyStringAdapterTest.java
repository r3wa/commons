package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.r3wa.commons.xml.EmptyStringAdapter;

public class EmptyStringAdapterTest {




	private EmptyStringAdapter emptyStringAdpater;




	@Before
	public void setUp() throws Exception {
		emptyStringAdpater = new EmptyStringAdapter();
	}




	@Test
	public void shouldReturnTheValue() throws Exception {
		 assertThat(emptyStringAdpater.unmarshal(""), equalTo(""));
		 assertThat(emptyStringAdpater.unmarshal(" "), equalTo(" "));
		 assertThat(emptyStringAdpater.unmarshal(null), nullValue());
	}



	@Test
	public void shouldReturnEmptyWhenTheValueIsBlank() throws Exception {
		assertThat(emptyStringAdpater.marshal(""), equalTo(""));
		assertThat(emptyStringAdpater.marshal(" "), equalTo(""));
		assertThat(emptyStringAdpater.marshal(null), equalTo(""));
	}

}
