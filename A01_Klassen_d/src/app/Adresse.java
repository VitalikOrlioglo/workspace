package app;

public class Adresse {
	
	private String ort;
	private String strasse;
	private String plz;
	public Adresse(String ort, String strasse, String plz) {
		super();
		this.ort = ort;
		this.strasse = strasse;
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	

}
