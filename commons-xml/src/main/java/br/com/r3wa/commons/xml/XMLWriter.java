package br.com.r3wa.commons.xml;

public interface XMLWriter<T> {

	String write(Class<T> c, T t);

}
