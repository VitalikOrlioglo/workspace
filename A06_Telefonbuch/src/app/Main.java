package app;

public class Main {

	public static void main(String[] args) {
		
		TelefonbuchImpl telefonbuchImpl = new TelefonbuchImpl();
		telefonbuchImpl.eintrag("Max", "123456");
		telefonbuchImpl.eintrag("Pyotr", "789");
		System.out.println(telefonbuchImpl.buch);
		System.out.println(telefonbuchImpl.findeNummer("Ma"));
		telefonbuchImpl.eintrageLoschen("Max");
		telefonbuchImpl.eintragAndern("Pyotr", "741");
		telefonbuchImpl.alleEintrageAnzeigen();
	}

}
