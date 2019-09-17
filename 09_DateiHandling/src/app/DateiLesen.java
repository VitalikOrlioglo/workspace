package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiLesen {

	public static void main(String[] args) {
		
		try {
			// FileReader oder besser
			// Scanner: mehr Methoden, weniger Exceptionhandling
			Scanner sc = new Scanner(new File("out.txt"));
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
