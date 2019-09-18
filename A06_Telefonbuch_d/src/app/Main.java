package app;

public class Main {

	public static void main(String[] args) {
		
		TelefonbuchImpl tel = new TelefonbuchImpl();
		
		try {
			tel.eintrag("Max", "123");
			tel.eintrag("Otto", "123");
			tel.eintrag("Max", "");
			tel.alleEintrageAnzeigen();
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
			System.out.println("Nummer leer oder null");
		} catch (Exception e) {
			System.out.println("Allgemeiner Fehler . . . ");
		}
	}

}
