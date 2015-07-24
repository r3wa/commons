package br.com.r3wa.commons.validator;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

class EntityToValidation  {



	@Size(max = 60 , message = "Numero máximo de caracteres = " + 60)
	private String size;


	@NotBlank(message="Nao pode null ou vazio")
	private String notBlank;

	@NotBlank(message="Nao pode null ou vazio")
	private String notNull;

	@NotEmpty
	private String notEmpty;


	public EntityToValidation(String size, String notBlank, String notNull,String notEmpty) {
		super();
		this.size = size;
		this.notBlank = notBlank;
		this.notNull = notNull;
		this.notEmpty = notEmpty;
	}


	public String getSize() {
		return size;
	}


	public String getNotBlank() {
		return notBlank;
	}


	public String getNotNull() {
		return notNull;
	}


	public String getNotEmpty() {
		return notEmpty;
	}



}
