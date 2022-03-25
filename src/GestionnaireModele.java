import java.util.ArrayList;

public class GestionnaireModele {
	private String listePasTrie;
 	private ArrayList<String> listeTxt;
	private ArrayList<String> listeDossier;
	private ArrayList<String> listeAutre;
	
	public GestionnaireModele(String listePasTrie) {
		listeTxt = new ArrayList<String>();
		listeAutre = new ArrayList<String>();
		listeDossier = new ArrayList<String>();
		this.listePasTrie = listePasTrie;
	}
	
	public void setListePasTrie(String listePasTrie) {
		this.listePasTrie = listePasTrie;
	}

	public String getListePasTrie() {
		return listePasTrie;
	}
	public ArrayList<String> getListeTxt() {
		return listeTxt;
	}
	public void setListeTxt(String txt) {
		listeTxt.add(txt);
	}
	public ArrayList<String> getListeDossier() {
		return listeDossier;
	}
	public void setListeDossier(String dossier) {
		listeDossier.add(dossier);
	}
	public ArrayList<String> getListeAutre() {
		return listeAutre;
	}
	public void setListeAutre(String Autre) {
		listeAutre.add(Autre);
	}

	
}
