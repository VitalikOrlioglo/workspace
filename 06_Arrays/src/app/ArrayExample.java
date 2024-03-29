package app;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		String [] farben = {"rot", "schwarz", "blau"};
		System.out.println(farben[1]);
		System.out.println(Arrays.toString(farben));
		
		for (int i = 0; i < farben.length; i++) {
			System.out.println(farben[i]);
		}
		System.out.println();
		
		farben[1] = "grun";
		
		for (String farbe : farben) {
			System.out.println(farbe);
		}
		
		int[] zahlen = new int[5];
		System.out.println(Arrays.toString(zahlen));
		
		int[][] zahlen2d = new int[3][5];
		System.out.println(Arrays.deepToString(zahlen2d));
		
		zahlen2d[0] = new int[] {4,3,2};
		System.out.println(Arrays.deepToString(zahlen2d));
	}

}
