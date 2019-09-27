package application;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Person {
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
	private int id;

	public Person(String vorname, int id) {
		super();
		this.vorname = vorname;
		this.id = id;
	}
	public Person(String vorname, String nachname, LocalDate geburtsdatum) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}
	public Person(String vorname, String nachname, LocalDate geburtsdatum, int id) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
