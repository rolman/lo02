package Divinite;


public class DiviniteGwenghelen extends Divinite {

	public DiviniteGwenghelen(){
		this.setNom("Gwenghelen");
		this.setDescription("Première Divinité à recevoir l'influence du Néant, Gwenghelen est celle qui en a reçu le plus de puissance.");
		this.setCosmologie("Aube");
		boolean tabDogmes []={false,true,true,true,false};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("Récupère autant de points d'Action supplémentaires d'Origine Néant que le nombre de Guides Spirituels que la Divinité possède.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}

}
