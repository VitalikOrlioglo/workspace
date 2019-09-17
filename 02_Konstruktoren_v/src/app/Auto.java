package app;

public class Auto {
	private String farbe;
	private int geschwindigkeit;
	private String marke;
	
	// Konstruktoren
	public Auto () {
		this("root"); // ruft Konstruktor mit einem String-Parameter
		System.out.println("Konstruktor ohne Parameter");
	}
	public Auto(String farbe) {
		System.out.println("Konstruktor mit einem String Parameter");
		this.farbe = farbe;
	}
	public Auto(String farbe, int geschwindigkeit) {
		this.farbe = farbe;
		this.setGeschwindigkeit(geschwindigkeit);
	}
	public Auto(int geschwindigkeit, String marke) {
		this.geschwindigkeit = geschwindigkeit;
		this.marke = marke;
	}
	
	
	
	@Override
	public String toString() {
		return "Auto [farbe=" + farbe + ", geschwindigkeit=" + geschwindigkeit + ", marke=" + marke + "]";
	}
	
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}
}
