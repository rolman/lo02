package Divinite;


public class DiviniteLlewella   extends Divinite {

	public DiviniteLlewella(){
		this.setNom("Llewella");
		this.setDescription("Divinit� machiav�lique et manipulatrice, Killinstred cherche � influencer et contr�ler ses ennemis.");
		this.setCosmologie("Nuit");
		this.setDogme(Dogme.Nature,true);
		this.setDogme(Dogme.Humain,false);
		this.setDogme(Dogme.Symboles,false);
		this.setDogme(Dogme.Mystique,true);
		this.setDogme(Dogme.Chaos,true);
		this.setCapacite("Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}
