package app;

public class Main {

	public static void main(String[] args) {
		Kunde k1 = new Kunde("Max Muller", 1);
		k1.setAdr(new Adresse("Berlin","Teststrasse","123"));
		
//		System.out.println(k1.getAdr().getStadt());
//		k1.getAdr().setStadt("Stuttgart");
//		System.out.println(k1.getAdr().getStadt());

//		System.out.println(k1.toString());
		Kunde k2 = new Kunde("Ina", 2, k1.getAdr());
		System.out.println(k2);
		
		k2.setAdr(new Adresse("Hamburg","Berliner Tor","123"));
		System.out.println(k2);
		System.out.println(k1);
		
		Kunde k3 = new Kunde();
		System.out.println(k3.getAdr());
		k3.getAdr().setStadt("Stut");
		System.out.println(k3.getAdr().getStadt().trim());
	}
}
