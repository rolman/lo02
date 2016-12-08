package Divinite;

import Divinite.Divinite.Dogme;

public class DivinitePuiTara   extends Divinite {

	public DivinitePuiTara(){
		this.setNom("Pui-Tara");
		this.setDescription("Pui-Tara est la Divinité sur laquelle l'influence de la Nuit s'est faite la plus forte.");
		this.setCosmologie("Nuit");
		this.setDogme(Dogme.Nature,true);
		this.setDogme(Dogme.Humain,false);
		this.setDogme(Dogme.Symboles,true);
		this.setDogme(Dogme.Mystique,true);
		this.setDogme(Dogme.Chaos,false);
		this.setCapacite("Peut détruire toutes les cartes de Croyants au centre de la table d'Origine Jour.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}
