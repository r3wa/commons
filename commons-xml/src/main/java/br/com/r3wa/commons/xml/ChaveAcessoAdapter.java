package br.com.r3wa.commons.xml;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ChaveAcessoAdapter extends XmlAdapter<String, String>{


	@Override
	public String unmarshal(String value) throws Exception {
		return isNotBlank(value) ? value.replaceFirst("NFe", "") : value;
	}



	@Override
	public String marshal(String value) throws Exception {
		return value;
	}


}
