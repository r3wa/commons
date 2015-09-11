package br.com.r3wa.commons.xml;

import org.junit.Before;
import org.junit.Test;

public class XStreamWriterTest {


	private XMLWriter<XML> xmlWriter;




	@Before
	public void setUp() throws Exception {
		xmlWriter = new XStreamWriter<>();
	}




	@Test
	public void shouldCreatOneXMLSTringWithTheXMLObject() {
/*		String xml = xmlWriter.write(XML.class, xmlObject());
		assertThat(xml, equalTo(xmlString()));*/
	}




	@Test(/*expected=R3WACommonsXmlException.class*/)
	public void shouldThrowOneR3WACommonsXmlExceptionToAnyProblem() {
		/*xmlWriter.write(XML.class, null);*/
	}































	// --------> METODOS AUXILIARES <----------

	private XML xmlObject() {
		XML xml = new XML();
		xml.attr1  = 1;
		xml.attr2 = "string";
		return xml;
	}


	private String xmlString() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><xml><attr1>1</attr1><attr2>string</attr2></xml>";
	}

}
