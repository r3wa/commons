package br.com.r3wa.commons.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@JAXB
public class JaxbXMLWriter<T> implements XMLWriter<T> {


	@Override
	public String write(Class<T> c, T t) {

		try {

			StringWriter sw = new StringWriter();
			createUnmarshaller(c).marshal(t, sw);

			return sw.toString();

		} catch (Exception e) {
			throw new R3WACommonsXmlException("One problem occcurred when writing the xml", e);
		}

	}




	private Marshaller createUnmarshaller(Class<T> c) throws JAXBException {
		return JAXBContext.newInstance(c).createMarshaller();
	}



}
