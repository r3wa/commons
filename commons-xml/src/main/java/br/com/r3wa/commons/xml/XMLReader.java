package br.com.r3wa.commons.xml;

public interface XMLReader<T> {

	T read(Class<T> c, String xml);

}
