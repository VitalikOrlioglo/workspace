package app;

/**
 * Super/Oberklasse, Parent, Ober
 * Student
 * @author vitali orlioglo
 * 16.09.2019
 * 07_Vererbung
 */

public class Fahrzeug {
	public Fahrzeug(String s) {}
	private void test1() {} // nur in dieser Klasse
	protected void test2() {}	// auch Unterklassen + Packageklaseen
	public void fahre( ) {
		System.out.println("Fahrzeug f�hrt . . . ");
	}

}
