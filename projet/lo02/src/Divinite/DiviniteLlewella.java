package Divinite;


public class DiviniteLlewella   extends Divinite {

	public DiviniteLlewella(){
		this.setNom("Llewella");
		this.setDescription("Divinit� machiav�lique et manipulatrice, Killinstred cherche � influencer et contr�ler ses ennemis.");
		this.setCosmologie("Nuit");
		boolean tabDogmes []={true,false,false,true,true};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}
