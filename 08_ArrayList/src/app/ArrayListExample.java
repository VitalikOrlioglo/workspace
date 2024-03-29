package app;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> farben = new ArrayList<>();
		farben.add("root");
		farben.add("grun");
		farben.add("blau");
		
		System.out.println(farben); // [rot, grun, blau]
		
		for (String farbe : farben) {
			System.out.println(farbe);
		}
		
		System.out.println();
		System.out.println(farben.get(1)); // grun
		farben.add(1, "gelb");
		
		System.out.println(farben); // [rot, gelb, grun, blau] -> insert
		
		farben.set(1, "braun");
		System.out.println(farben); // [rot, braun, grun, blau]
		
		farben.remove("braun"); // oder uber index
		System.out.println(farben); // [rot, grun, blau]
		
		System.out.println(farben.contains("braun")); // false -Y istVorhanden?
		
		for (int i = 0; i < farben.size(); i++) {
			System.out.println(farben.get(i));
		}
		
		
		Collections.sort(farben);
		System.out.println();
		System.out.println(farben);
	}

}
