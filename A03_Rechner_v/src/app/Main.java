package app;

/**
 * Konsoleingaben und Schleifen
 * Zahl1:
 * >>5
 * Zahl2:
 * >>3
 * Operator:
 * >>+
 * Ergebnis:
 * 8
 * Weiter? (y/n)
 * -> bei y geht es vom Anfang wieder los
 * 
 */

public class Main {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 1;
		char op = '?';
		double res = Rechner.rechner(num1, num2, op);
		
//		System.out.println(Double.isNaN(res)?"Fehler":"Ergebnis: " + num1 + op + num2 + " = " + res);
		
//		if (Double.isNaN(res)) {
//			System.out.println("Fehler");
//		}else if(Double.isInfinite(res)){
//			System.out.println("nicht durch 0 teilen");
//		}else {
//			System.out.println("Ergebnis: " + num1 + op + num2 + " = " + res);
//		}
		System.out.println(Rechner.isValidOperator('/'));
	}

}
