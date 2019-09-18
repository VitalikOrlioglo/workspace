package model;

public interface Telefonbuch {
	boolean eintrag(String name, String nummer);
	String findeNummer(String name);
	boolean eintrageLoschen(String name);
	void alleEintrageAnzeigen();
	boolean eintragAndern(String name, String nummer);
}
