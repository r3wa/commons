package br.com.r3wa.commons.xml;

import static org.apache.commons.lang3.StringUtils.isBlank;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class EmptyStringAdapter extends XmlAdapter<String, String> {





	@Override
	public String unmarshal(String value) throws Exception {
		return value;
	}



	@Override
	public String marshal(String value) throws Exception {
		return isBlank(value) ? "" : value;
	}


}
