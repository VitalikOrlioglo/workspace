package app;

class Ober{
	public int methode(){
		return 2;
	}
	
	public int methode2(){
		return methode();
	}
}

class Unter extends Ober{

	

	public int methode() {
		return 1;
	}
}

public class Raetsel {
	public static void main(String[] args) {
		Ober o  = new Unter();
		System.out.println(o.methode2()); 
	}
}