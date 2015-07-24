package br.com.r3wa.commons.xml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


@JAXB
public class JaxbXMLReader<T> implements XMLReader<T> {


	@Override
	@SuppressWarnings("unchecked")
	public T read(Class<T> c, String xml) {
		try {
			return (T) createUnmarshaller(c).unmarshal(new StreamSource(new StringReader(xml.trim())));
		} catch (Exception e) {
			throw new R3WACommonsXmlException("One problem occcurred when reading the xml", e);
		}
	}





	private Unmarshaller createUnmarshaller(Class<T> c) throws JAXBException {
		return JAXBContext.newInstance(c).createUnmarshaller();
	}

}
