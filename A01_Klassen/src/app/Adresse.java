package app;

public class Adresse {
	private String stadt;
	private String strase;
	private String plz;
	
	public Adresse() {}
	
	public Adresse(String stadt, String strase, String plz) {
		this.strase = strase;
		this.stadt = stadt;
		this.plz = plz;
	}
	
	
	
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getStrase() {
		return strase;
	}
	public void setStrase(String strase) {
		this.strase = strase;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}



	@Override
	public String toString() {
		return "Adresse [stadt=" + stadt + ", strase=" + strase + ", plz=" + plz + "]";
	}
	
}
