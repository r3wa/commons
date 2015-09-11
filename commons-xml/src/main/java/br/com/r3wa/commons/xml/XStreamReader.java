package br.com.r3wa.commons.xml;

import com.thoughtworks.xstream.XStream;

public class XStreamReader<T> implements XMLReader<T> {

	
	private XStream xStream = new XStream();
	
	
	@Override
	public T read(Class<T> c, String xml) {		
		try {
			xStream.processAnnotations(c);
			return  c.cast( xStream.fromXML(xml) ) ;			
		} catch (Exception e) {
			throw new R3WACommonsXmlException("One problem occcurred when reading the xml", e);
		}
	}

	
	
}
