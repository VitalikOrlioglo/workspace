package app;

import java.time.LocalDate;

public class Kunde {
	
	private int id;
	private String name;
	private char kategorie;
	private boolean neuKunde;
	private Adresse adresse;
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Kunde() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Kunde(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getKategorie() {
		return kategorie;
	}
	public void setKategorie(char kategorie) {
		this.kategorie = kategorie;
	}
	public boolean isNeuKunde() {
		return neuKunde;
	}
	public void setNeuKunde(boolean neuKunde) {
		this.neuKunde = neuKunde;
	}
	
	
	

}
