package Divinite;


public class DiviniteKillinstred extends Divinite {

	public DiviniteKillinstred(){
		this.setNom("Killinstred");
		this.setDescription("Divinit� machiav�lique et manipulatrice, Killinstred cherche � influencer et contr�ler ses ennemis.");
		this.setCosmologie("Nuit");
		this.setDogme(Dogme.Nature,false);
		this.setDogme(Dogme.Humain,true);
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
