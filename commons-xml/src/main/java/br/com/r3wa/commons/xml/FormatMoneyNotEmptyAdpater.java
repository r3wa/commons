package br.com.r3wa.commons.xml;


import static java.math.RoundingMode.HALF_UP;
import static org.apache.commons.lang3.math.NumberUtils.toDouble;
import static org.apache.commons.math3.util.Precision.round;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FormatMoneyNotEmptyAdpater extends XmlAdapter<String, Double> {






	@Override
	public Double unmarshal(String value) throws Exception {
		return round(toDouble(value), 2);
	}



	@Override
	public String marshal(Double value) throws Exception {
		return value == null ? "0.00" : new BigDecimal(value).setScale(2, HALF_UP).toString();
	}




}
