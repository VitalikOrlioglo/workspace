package app3;

class Ober{
	public static int methode(){
		return 2;
	}
	
	public static int methode2(){
		return methode();
	}
}

class Unter extends Ober{

	
	public static int methode() {
		return 1;
	}
}

public class Raetsel {
	public static void main(String[] args) {
		Ober o  = new Unter();
		System.out.println(Ober.methode2()); 
	}
}