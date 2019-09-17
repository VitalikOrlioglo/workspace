package app;

public class Main {
	public static void main(String[] args){
		Auto a1 = new Auto("gelb"); // Konstruktor-Aufruf
		
		Auto a2 = new Auto("root", 100);
		
		Auto a3 = new Auto(200, "Ford");
		
		Auto a4 = new Auto();
		System.out.println(a4.getFarbe());
		System.out.println(a4);

    }
}
