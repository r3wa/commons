package br.com.r3wa.commons.xml;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class XstreamXMLReaderTest {


	private XMLReader<XML> xmlReader;


	@Before
	public void setUp() throws Exception {
		xmlReader = new XStreamReader();
	}


	

	@Test
	public void shouldCreatOneObjectWithTheXML() {
		XML xml =  xmlReader.read(XML.class,"<xml><attr1>1</attr1><attr2>string</attr2></xml>");
		/*assertThat(xml.attr1, equalTo(1));
		assertThat(xml.attr2, equalTo("string"));*/
	}


	

	@Test(expected=R3WACommonsXmlException.class)
	public void shouldThrowOneR3WACommonsXmlExceptionToAnyProblem() {
		/*xmlReader.read(XML.class,null);*/
	}

	

}
