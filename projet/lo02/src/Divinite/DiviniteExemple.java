package Divinite;



public class DiviniteExemple  extends Divinite {

	public DiviniteExemple(){
		this.setNom("");
		this.setDescription("");
		this.setCosmologie("");
		boolean tabDogmes []={true,true,true,false,false};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}


