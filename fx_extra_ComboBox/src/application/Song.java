package application;

public class Song {
    
    private String titel;
    private String artist;
    public Song(String titel, String artist) {
	super();
	this.titel = titel;
	this.artist = artist;
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    @Override
    public String toString() {
	return titel+": "+ artist;
    }
    
    
    
    

}
