package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Telefonbuch;
import model.TelefonbuchImpl;


public class SampleController {
	
	private String okAction = "nix";
	private final String neuerEintrag = "NEUER_EINTRAG";
	private final String sucheNummer = "SUCHE_NUMMER";
	private final String eintragLoeschen = "EINTRAG_LOESCHEN";
	private final String eintragAendern = "EINTRAG_AENDERN";
	private final String alleEintraegeAnzeigen = "ALLE_EINTRAEGE_ANZEIGEN";
	
	private Telefonbuch tb;
	
	
	
	@FXML // erkennt brauch import
	void initialize() {
		//System.out.println("init...");
		tb = new TelefonbuchImpl();
	}

	
	String name, nummer = null;
	boolean isValid=false;

	
	
    @FXML
    private TextField feldName;

    @FXML
    private TextField feldNummer;

    @FXML
    private Label labelName;
    
    @FXML
    private Button okButton;

    @FXML
    private Label labelNummer;

    @FXML
    private Label labelSystem;

    @FXML
    private TextField textArea;

    
    @FXML
    void neuerEintrag(ActionEvent event) {
    	setzeFelderZurueck();
    	okButton.setVisible(true);
    	feldName.setVisible(true);
    	feldNummer.setVisible(true);
    	okAction=neuerEintrag;
    }
    
    @FXML
    void sucheNummer(ActionEvent event) {
    	setzeFelderZurueck();
    	okButton.setVisible(true);
    	feldName.setVisible(true);
    	okAction=sucheNummer;
    }
    
    @FXML
    void eintragLoeschen(ActionEvent event) {
    	setzeFelderZurueck();
    	okButton.setVisible(true);
    	feldName.setVisible(true);
    	okAction=eintragLoeschen;
    }
    
    @FXML
    void eintragAendern(ActionEvent event) {
    	setzeFelderZurueck();
    	okButton.setVisible(true);
    	feldName.setVisible(true);
    	feldNummer.setVisible(true);
    	okAction=eintragAendern;
    }
    
    @FXML
    void alleEintraegeAnzeigen(ActionEvent event) {
    	setzeFelderZurueck();
    	tb.alleEintraegeAnzeigen();
    }
    
    @FXML
    void ok(ActionEvent event) {
    	switch (okAction) {//OKButton hat vielfältige Jobs
    	
    	case neuerEintrag:
    		isValid=tb.eintrag(feldName.getText(), feldNummer.getText());
    		labelSystem.setVisible(true);
    		if (isValid) 
    			labelSystem.setText("Eintrag erfolgreich gespeichert");
    		else
    			labelSystem.setText("Eintrag nicht gespeichert");
    		break;
    	case sucheNummer:
    		labelNummer.setVisible(true);
    		labelNummer.setText(tb.findeNummer(feldName.getText()));
    		break;
    	case eintragLoeschen:
    		isValid=tb.eintragLoeschen(feldName.getText());
    		labelSystem.setVisible(true);
			if (isValid) 
				labelSystem.setText("Eintrag erfolgreich gelöscht");
			else
				labelSystem.setText("Eintrag nicht gelöscht");
			break;
    	case eintragAendern:
    		isValid=tb.eintragAendern(feldName.getText(), feldNummer.getText());
    		labelSystem.setVisible(true);
    		if (isValid) 
    			labelSystem.setText("Eintrag erfolgreich geändert");
    		else
    			labelSystem.setText("Eintrag nicht geändert");
    		break;
    	case alleEintraegeAnzeigen:
    		
    		break;
    	}
    }
    
    private void setzeFelderZurueck() {//macht felder unsichtbar, löscht einträge
    	feldNummer.setVisible(false);
    	feldName.setVisible(false);
    	labelName.setVisible(false);
    	labelNummer.setVisible(false);
    	labelSystem.setVisible(false);
    	feldName.clear();
    	feldNummer.clear();
    	okButton.setVisible(false);
    	
    	return;
    }

}

