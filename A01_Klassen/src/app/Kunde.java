package app;

import java.time.LocalDate;

public class Kunde {
	private String name;
	private int id;
	private char kategorie;
	private boolean neuKunde;

	private Adresse adr = new Adresse();
	 
	public Kunde() {}
	public Kunde(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Kunde(String name, int id, Adresse adr) {
		this.name = name;
		this.id = id;
		this.adr = adr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Kunde [name=" + name + ", id=" + id + ", kategorie=" + kategorie + ", neuKunde=" + neuKunde + ", adr="
				+ adr + "]";
	}
	
}
