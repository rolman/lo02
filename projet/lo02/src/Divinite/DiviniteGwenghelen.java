package Divinite;


public class DiviniteGwenghelen extends Divinite {

	public DiviniteGwenghelen(){
		this.setNom("Gwenghelen");
		this.setDescription("Premi�re Divinit� � recevoir l'influence du N�ant, Gwenghelen est celle qui en a re�u le plus de puissance.");
		this.setCosmologie("Aube");
		boolean tabDogmes []={false,true,true,true,false};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("R�cup�re autant de points d'Action suppl�mentaires d'Origine N�ant que le nombre de Guides Spirituels que la Divinit� poss�de.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}

}
