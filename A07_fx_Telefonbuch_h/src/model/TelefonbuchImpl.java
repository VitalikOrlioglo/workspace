package model;

import java.util.HashMap;

/*
 * Mit Hilfe von HashMap implementieren
 * - Klasse main zum Testen:
 * Einträge erzeugen, alle anzeigen, löschen, ändern
 */


public class TelefonbuchImpl implements Telefonbuch{

	HashMap<String, String> verzeichnis = new HashMap<>();
	
	
	
	@Override
	public boolean eintrag(String name, String nummer) {
		verzeichnis.put(name, nummer);
		
		return true;
	}

	@Override
	public String findeNummer(String name) {
	
		return verzeichnis.get(name);
	}

	@Override
	public boolean eintragLoeschen(String name) {
		if (verzeichnis.containsKey(name)) {
			verzeichnis.remove(name);
			return true;
		}
			return false;
	}

	@Override
	public void alleEintraegeAnzeigen() {
		for (String name: verzeichnis.keySet()){
			System.out.println(name + " " + verzeichnis.get(name));
			
		}
		System.out.println("--------------------------");
		 
		
	}

	@Override
	public boolean eintragAendern(String name, String nummer) {
		if (verzeichnis.containsKey(name)) {
			verzeichnis.put(name, nummer);
			return true;
		}
		return false;
		}

}
	          
