package Divinite;

public class DiviniteGorpa  extends Divinite {

	public DiviniteGorpa(){
		this.setNom("Gorpa");
		this.setDescription("Divinit� joueuse et espi�gle, Gorpa aime g�ner ses consoeurs dans leur recherche de puissance.");
		this.setCosmologie("Crepuscule");
		boolean tabDogmes []={false,true,true,false,true};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut r�cup�rer les points d'Action d'une autre Divinit� en plus des siens. L'autre Divinit� ne re�oit aucun point d'Action ce tour-ci.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}


