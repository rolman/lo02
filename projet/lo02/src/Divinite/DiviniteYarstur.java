package Divinite;



public class DiviniteYarstur extends Divinite {
	
	
	public DiviniteYarstur(){
		this.setNom("Yarstur");
		this.setDescription("Dernier pur du jour, Yarstur combat le N�ant sous toutes ses formes.");
		this.setCosmologie("Jour");
		boolean tabDogmes []={false,false,true,true,true};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine N�ant.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}

}
