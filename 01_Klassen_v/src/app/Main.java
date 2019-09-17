package app;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(); // Referenz / Konstruktor
		p1.setName("Max");
		System.out.println(p1.getName());
		Person p2 = new Person();
		System.out.println(p2.getName());
		Person p3 = p2;
		System.out.println(p3.getName());
	}

}