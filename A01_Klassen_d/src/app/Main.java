package app;

public class Main {

	public static void main(String[] args) {
		
		Kunde k1 = new Kunde(1, "Max M�ller");
		
		k1.setAdresse(new Adresse("Berlin", "Teststra�e 4", "23425"));
		
		System.out.println(k1.getAdresse().getStrasse());
		
		k1.getAdresse().setStrasse("Dorfstra�e 34");
		System.out.println(k1.getAdresse().getStrasse());
		
		
		

	}

}
