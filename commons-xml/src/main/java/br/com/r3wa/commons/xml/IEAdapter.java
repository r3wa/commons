package br.com.r3wa.commons.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IEAdapter extends XmlAdapter<String, String>{


	@Override
	public String unmarshal(String value) throws Exception {
		return value;
	}



	@Override
	public String marshal(String value) throws Exception {
		return "ISENTO".equals(value) ? null : value;
	}


}
