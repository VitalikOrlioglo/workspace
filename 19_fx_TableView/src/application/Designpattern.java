package application;

public class Designpattern {
	private String patternName;
	private String beschreibung;
	
	public Designpattern(String patternName, String beschreibung) {
		super();
		this.patternName = patternName;
		this.beschreibung = beschreibung;
	}
	
	public Designpattern() {}

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
}
