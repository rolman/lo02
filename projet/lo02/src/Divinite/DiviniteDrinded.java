package Divinite;

public class DiviniteDrinded extends Divinite {
	
	
	public DiviniteDrinded(){
		this.setNom("Drinded");
		this.setDescription("Défenseur des hommes, quelles que soient leurs croyances, Drinded protège les chefs religieux");
		this.setCosmologie("Jour");
		boolean tabDogmes []={true,true, false,true,false};
		this.setDogmes(tabDogmes);
		
		this.setCapacite("Peut empêcher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}

}
