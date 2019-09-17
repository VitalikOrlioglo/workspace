package app;

import java.util.Scanner;
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
		Scanner scanner = new Scanner(System.in);
		char weiter = 'y';
		while (weiter == 'y') {
			System.out.print("zahl1: ");
			double zahl1 = scanner.nextDouble();
			
			System.out.print("zahl2: ");
			double zahl2 = scanner.nextDouble();
			
			System.out.print("Operator: ");
			char operator = scanner.next().charAt(0);
			
			double result = Rechner.rechner(zahl1, zahl2, operator);
			System.out.println("Ergebnis: " + result);
			System.out.println("Weiter? (y/n)");
			weiter = scanner.next().charAt(0);
		}
		scanner.close();
	}

}
