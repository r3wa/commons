package br.com.r3wa.commons.xml;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FormatDateAdpater extends XmlAdapter<String, Date> {



	private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX':00'");





	@Override
	public Date unmarshal(String value) throws Exception {
		return value != null ? DATE_FORMAT.parse(value) : null;
	}


	@Override
	public String marshal(Date date) throws Exception {
		return date != null ? DATE_FORMAT.format(date) : null;
	}

}
