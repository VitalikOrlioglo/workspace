package app;

public class Main {

	public static void main(String[] args) {
		Fahrzeug f1 = new Auto();
		f1.fahre();
		
		f1 = new Motorrad();
		f1.fahre();
		
		Rennbahn r = new Rennbahn();
		r.fahreAlles(new Auto()); // Auto fahrt . . .
		r.fahreAlles(new Motorrad()); // Motorrad fahrt . . .
		
		// Alternative, um Interface zu benutzen: anonym
		
		Fahrzeug f2 = new Fahrzeug() {
			
			@Override
			public void stop() {
				System.out.println("Fahrzeug stop . . . ");
			}
			
			@Override
			public void fahre() {
				System.out.println("Fahrzeug fahrt . . . ");
			}
		};
		r.fahreAlles(f2); // Fahrzeug fahrt . . . 
	}

}
