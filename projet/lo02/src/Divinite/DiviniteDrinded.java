package Divinite;

public class DiviniteDrinded extends Divinite {
	
	
	public DiviniteDrinded(){
		this.setNom("Drinded");
		this.setDescription("D�fenseur des hommes, quelles que soient leurs croyances, Drinded prot�ge les chefs religieux");
		this.setCosmologie("Jour");
		boolean tabDogmes []={true,true, false,true,false};
		this.setDogmes(tabDogmes);
		
		this.setCapacite("Peut emp�cher le sacrifice d'un des Guides Spirituels de n'importe quel joueur.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}

}
