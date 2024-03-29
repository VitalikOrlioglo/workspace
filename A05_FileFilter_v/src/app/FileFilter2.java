package app;
/*
 * - aus Datei in Datenstruktur einlesen z.B. ArrayList
 * - Sortiert mit Standardmethode
 * - Mehrfache Eintrage sollen entfernt werden
 * - neue Datei top10000deNeu.txt schreiben
 * 
 * Ergebnis: Date mit 10 000 sortierten Zeilen
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class FileFilter2 {
	
	private static final String IN_FILE = "top10000de.txt";
	private static final String OUT_FILE = "top10000deNeu.txt";

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		TreeSet<String> set = new TreeSet<String>();
		try(    Scanner sc = new Scanner(new File(IN_FILE));
				BufferedWriter w = new BufferedWriter(new FileWriter(OUT_FILE));
				){ // auto close, wir brauchen kein sc.close() methode zu aufrufen			
			while (sc.hasNext()) {
				set.add(sc.nextLine());
			}
			for (String line : set) {
				w.write(line);
				w.newLine(); // System.lineSeparator
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
