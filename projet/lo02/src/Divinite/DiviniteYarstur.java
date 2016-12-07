package Divinite;



public class DiviniteYarstur extends Divinite {
	
	
	public DiviniteYarstur(){
		this.setNom("Yarstur");
		this.setDescription("Dernier pur du jour, Yarstur combat le Néant sous toutes ses formes.");
		this.setCosmologie("Jour");
		boolean tabDogmes []={false,false,true,true,true};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Néant.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}

}
