package app;

import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreiben {

	public static void main(String[] args) {
		System.out.println("write File . . .");
		try {
			FileWriter fw = new FileWriter("out.txt");
			fw.write("erste Zeile \nzweite Zeile");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
