package app;

public class Main {

	public static void main(String[] args) {
		Auto a = new Auto();
		a.fahre();
		a.test2();
		
		Fahrzeug f = new Auto();
		// zur Laufzeit steckt hinter f ein Auto-Objekt
		f.fahre();
		
		((Auto) f).setAutomarke("BMW");
		System.out.println(((Auto) f).getAutomarke());
		}
}
