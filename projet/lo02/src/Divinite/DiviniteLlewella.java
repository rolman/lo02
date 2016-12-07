package Divinite;


public class DiviniteLlewella   extends Divinite {

	public DiviniteLlewella(){
		this.setNom("Llewella");
		this.setDescription("Divinité machiavélique et manipulatrice, Killinstred cherche à influencer et contrôler ses ennemis.");
		this.setCosmologie("Nuit");
		boolean tabDogmes []={true,false,false,true,true};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut obliger un joueur à poser une carte Apocalypse s'il en possède une.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}
