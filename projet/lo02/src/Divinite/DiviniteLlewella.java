package Divinite;


public class DiviniteLlewella   extends Divinite {

	public DiviniteLlewella(){
		this.setNom("Llewella");
		this.setDescription("Divinité machiavélique et manipulatrice, Killinstred cherche à influencer et contrôler ses ennemis.");
		this.setCosmologie("Nuit");
		this.setDogme(Dogme.Nature,true);
		this.setDogme(Dogme.Humain,false);
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
