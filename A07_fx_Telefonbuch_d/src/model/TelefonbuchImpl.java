package model;

import java.util.HashMap;
import java.util.Map;

/*
 * mit Hilfe von HashMap implementieren
 * -Klasse Main zum testen (mainmethode):
 *  einträge machen, alle anzeigen, löschen, ändern
 */

public class TelefonbuchImpl implements  Telefonbuch{
	
	private Map<String, String> map = new HashMap<>();

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public boolean eintrag(String name, String nummer) {
		//TODO Exception throw: "", null, length
		if(nummer == null || nummer.equals("")) {
			throw new IllegalArgumentException("Name: "+name);
		}
	
		return map.put(name, nummer)==null;
	}

	@Override
	public String findeNummer(String name) {
		//TODO Exception
		return map.get(name);
	}

	@Override
	public boolean eintragLoeschen(String name) {
		if(map.containsKey(name)) {
			map.remove(name);
			return true;
		}
		return false;
	}

	@Override
	public void alleEintraegeAnzeigen() {
		for (String name : map.keySet()) {
			System.out.println("Name:"+name+ "+Nummer: "+map.get(name)  );
		}
		
	}

	@Override
	public boolean eintragAendern(String name, String nummer) {
		if (!map.containsKey(name)) return false;
		return !eintrag(name, nummer);
	}

	
}
