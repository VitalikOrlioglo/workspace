package app;

import java.util.Arrays;

public class Methoden {
	// soll die grossere von zwei Zahlen zuruck geben
	public static int max(int a, int b) {
		if (a == b) {
			System.out.println("Zahlen sind gleich");
		}
		return a>b?a:b;
	}
	
	// soll die gro�te von drei Zahlen zuruck geben
	public static int max(int a, int b, int c) {
//		return max(a,max(b,c));
		return max(a,b) > c? max(a,b) :c;

//		if (a == b && a == c && b == c) {
//			System.out.println("Zahlen sind gleich");
//		}
//		if (a > b && a > c) {
//			return a;
//		} else if (b > a && b > c){
//			return b;
//		}
//		return c;
	}
	
	// soll die gro�te Zahl eines Arrays zuruck geben
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// soll nur gerade Zahlen ausgeben
	public static void printGerade(int[] arr) {
		
		for (int i : arr) {
			if (i %2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] %2 == 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
		System.out.println();
	}
	
	/**
	 *Zusatz
	 *soll ein zweidimensionales Array in dieser Form ausgeben
	 * 1 2 3 2
	 * 3 5 5 6
	 * 2 4 6 7
	 * 
	 */
	
	public static void print2d(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int[][] arr2d = 	{
				{3,4},
				{1,6},
				{4,8}
			};
//		print2D(arr2d);
		
		
		System.out.println(max(3,4));
		System.out.println(max(4,4,5));
		System.out.println(max(array));
		printGerade(array);
		print2d(arr2d);
	}

}
