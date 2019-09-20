package model;

public interface Telefonbuch {

	boolean eintrag(String name, String nummer);
	
	String findeNummer(String name);
	
	boolean eintragLoeschen(String name);
	
	void alleEintraegeAnzeigen();
	
	boolean eintragAendern(String name, String nummer);
	
}
