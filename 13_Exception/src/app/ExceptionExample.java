package app;

public class ExceptionExample {
	public void m1(int n) throws Exception {
		System.out.println("m1");
		if (n<0) {
			throw new Exception("keine negativen Zahlen"); // verlasst die Methode
		}
		System.out.println("hier geht es weiter . . . " + n);
	}
	
	public void m2() throws Exception {
		System.out.println("m2");
		m1(-10);
	}
	public static void main(String[] args) {
		System.out.println("main");
		ExceptionExample ee = new ExceptionExample();
		try {
			ee.m2();
		} catch (Exception e) {
			System.err.println("Fehler . . . " + e.getMessage()); // err zeigt message in rot farbe
		}
	}

}
