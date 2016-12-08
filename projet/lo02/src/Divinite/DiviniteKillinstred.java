package Divinite;


public class DiviniteKillinstred extends Divinite {

	public DiviniteKillinstred(){
		this.setNom("Killinstred");
		this.setDescription("Divinité machiavélique et manipulatrice, Killinstred cherche à influencer et contrôler ses ennemis.");
		this.setCosmologie("Nuit");
		this.setDogme(Dogme.Nature,false);
		this.setDogme(Dogme.Humain,true);
		this.setDogme(Dogme.Symboles,false);
		this.setDogme(Dogme.Mystique,true);
		this.setDogme(Dogme.Chaos,true);
		this.setCapacite("Peut obliger un joueur à poser une carte Apocalypse s'il en possède une.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}
