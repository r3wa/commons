package br.com.r3wa.commons.xml;

import static javax.xml.bind.annotation.XmlAccessType.NONE;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(NONE)
@XmlRootElement(name="xml")
class XML {


	@XmlElement
	int attr1;

	@XmlElement
	String attr2;
}
