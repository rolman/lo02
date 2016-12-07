package Divinite;


public class DiviniteKillinstred extends Divinite {

	public DiviniteKillinstred(){
		this.setNom("Killinstred");
		this.setDescription("Divinité machiavélique et manipulatrice, Killinstred cherche à influencer et contrôler ses ennemis.");
		this.setCosmologie("Nuit");
		boolean tabDogmes []={false,true,false,true,true};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut obliger un joueur à poser une carte Apocalypse s'il en possède une.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}
