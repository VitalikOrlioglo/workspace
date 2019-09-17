package app;

public class Main {

	public static void main(String[] args) {
		String s = StaticExample.klassenvariable;
		System.out.println(s);
		StaticExample.klassenMethode();
		
		StaticExample se = new StaticExample();
		se.instanzMethode();
		
		se.klassenMethode(); // ist nicht so toll
	}

}
