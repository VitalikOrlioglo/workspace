package app;
/*
 * mit Hilfe von HashMap implementieren
 *  - Klasse Main zum testen:
 *  eintrage machen, alle anzeigen, loschen, andern, suchen
 */

import java.util.HashMap;
import java.util.Map;

public class TelefonbuchImpl implements Telefonbuch{

	private Map<String, String> map = new HashMap<>();
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public boolean eintrag(String name, String nummer) {
		// TODO Exception throw: "", null, length
		if (nummer == null || nummer.equals("")) {
			throw new IllegalArgumentException("Name" + name);
		}
		return map.put(name, nummer)!=null;
	}

	@Override
	public String findeNummer(String name) {
		// TODO Exception 
		return map.get(name);
	}

	@Override
	public boolean eintrageLoschen(String name) {
		if (map.containsKey(name)) {
			map.remove(name);
			return true;
		}
		return false;
	}

	@Override
	public void alleEintrageAnzeigen() {
		for (String name : map.keySet()) {
			System.out.println("Name: " + name + "Nummer:" + map.get(name));
		}
	}

	@Override
	public boolean eintragAndern(String name, String nummer) {
		if (!map.containsKey(name)) {
			return false;
		}
		return !eintrag(name, nummer);
	}
}
