package Divinite;

import Divinite.Divinite.Dogme;

public class DiviniteDrinded extends Divinite {
	
	
	public DiviniteDrinded(){
		this.setNom("Drinded");
		this.setDescription("D�fenseur des hommes, quelles que soient leurs croyances, Drinded prot�ge les chefs religieux");
		this.setCosmologie("Jour");
		this.setDogme(Dogme.Nature,true);
		this.setDogme(Dogme.Humain,true);
		this.setDogme(Dogme.Symboles,false);
		this.setDogme(Dogme.Mystique,true);
		this.setDogme(Dogme.Chaos,false);
		this.setCapacite("Peut emp�cher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}

}
