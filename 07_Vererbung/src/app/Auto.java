package app;
/**
 * - Kind, Child, Unter
 * - erbt von Fahrzeug
 * - specialisiert/erweitert Fahrzeug
 * Student
 * @author vitali orlioglo
 * 16.09.2019
 * 07_Vererbung
 */

public class Auto extends Fahrzeug {
	 public Auto(String s) {
		super(s);
	}

	private String automarke;

	public String getAutomarke() {
		return automarke;
	}

	public void setAutomarke(String automarke) {
		this.automarke = automarke;
	}
	
	@Override
	public void fahre() {
		System.out.println("Auto f�hrt . .  .");
	}

}
