package app;
/*
 * - aus Datei in Datenstruktur einlesen z.B. ArrayList
 * - Sortiert mit Standardmethode
 * - Mehrfache Eintrage sollen entfernt werden
 * - neue Datei top10000deNeu.txt schreiben
 * 
 * Ergebnis: Date mit 10 000 sortierten Zeilen
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileFilter {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File file = new File("top10000de.txt");
		ArrayList<String> top = new ArrayList<String>();
		Scanner sc;
		System.out.println("Einlesen . . .");
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				top.add(sc.nextLine());
			}
			sc.close();
			System.out.println("Insgesamt lines " + top.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sortieren . . .");
		Collections.sort(top);
		
		System.out.println("doppelte Entfernung . . .");
		 Object[] st = top.toArray();
	      for (Object s : st) {
	        if (top.indexOf(s) != top.lastIndexOf(s)) {
	        	top.remove(top.lastIndexOf(s));
	         }
	      }
		
		System.out.println("write File . . .");
		try {
			FileWriter fw = new FileWriter("top10000deNeu.txt");
			for (String arr : top) {
				fw.write(arr + "\n");
			}
			fw.close();
			System.out.println(System.currentTimeMillis() - start);
			System.out.println("Insgesamt lines nach dem . . . " + top.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
