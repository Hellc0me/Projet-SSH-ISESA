import java.util.Scanner;

public class GestionnaireControle {
	public GestionnaireControle(GestionnaireModele gM){
		
		String listePasTrie = gM.getListePasTrie();
		listePasTrie = listePasTrie.replace("      "," ");
		listePasTrie = listePasTrie.replace("     "," ");
		listePasTrie = listePasTrie.replace("    "," ");
		listePasTrie = listePasTrie.replace("   "," ");
		listePasTrie = listePasTrie.replace("  "," ");
		System.out.println(listePasTrie);
		Scanner sc = new Scanner(listePasTrie);	
		sc.nextLine();
		while(sc.hasNextLine()) {
			Scanner sc1 = new Scanner(sc.nextLine());
			sc1.useDelimiter(" ");
			if(sc1.next().contains("d")) {
				for(int i=0; i<7;i++) {
					System.out.println(sc1.next());
				}
				gM.setListeDossier(sc1.next());
			}
			else {
				for(int i=0; i<7;i++) {
					System.out.println(sc1.next());
				}
				gM.setListeAutre(sc1.next());
			}
			sc1.close();
		}
		sc.close();
		System.out.println(gM.getListeDossier());
	}
	
}
