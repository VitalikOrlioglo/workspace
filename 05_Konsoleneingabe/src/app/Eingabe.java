package app;

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = scanner.next();
		
		System.out.println("Alter: ");
		int alter = scanner.nextInt();
		
		System.out.println("ein Zeichen: ");
		char zeichen = scanner.next().charAt(0);
		
		System.out.printf("Name: %s, Alter: %d, Zeichen: %s     ", name, alter, zeichen);
		scanner.close();
	}

}
