package jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2694361767385826527L;
	private String name;
	private Adresse adresse;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Adresse adresse) {
		super();
		this.name = name;
		this.adresse = adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	

}
