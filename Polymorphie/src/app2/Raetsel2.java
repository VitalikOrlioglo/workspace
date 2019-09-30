package app2;

class Ober{
	int a = 2;
	
}

class Unter extends Ober{

	int a = 3;
	
}

public class Raetsel2 {
	public static void main(String[] args) {
		Ober o =  new Unter();
		System.out.println(o.a); 	
	}
}