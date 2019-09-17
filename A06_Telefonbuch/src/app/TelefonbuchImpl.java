package app;
/*
 * mit Hilfe von HashMap implementieren
 *  - Klasse Main zum testen:
 *  eintrage machen, alle anzeigen, loschen, andern, suchen
 */

import java.util.HashMap;

public class TelefonbuchImpl implements Telefonbuch{

	HashMap<String, String> buch = new HashMap<>();
	
	@Override
	public boolean eintrag(String name, String nummer) {
		buch.put(name, nummer);
		return buch.containsKey(nummer) ? true : false;
	}

	@Override
	public String findeNummer(String name) {
		return buch.get(name);
	}

	@Override
	public boolean eintrageLoschen(String name) {
		if (buch.containsKey(name)) {
			buch.remove(name);
			return true;
		}
		return false;
	}

	@Override
	public void alleEintrageAnzeigen() {
		for (String key : buch.keySet()) {
			System.out.println(key + ": " + buch.get(key));
		}
	}

	@Override
	public boolean eintragAndern(String name, String nummer) {
		if (buch.containsKey(name)) {
			buch.put(name, nummer);
			return true;
		}
		return false;
	}
}
