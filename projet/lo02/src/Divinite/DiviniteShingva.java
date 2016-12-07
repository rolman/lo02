package Divinite;

public class DiviniteShingva  extends Divinite {

	public DiviniteShingva(){
		this.setNom("");
		this.setDescription("");
		this.setCosmologie("");
		boolean tabDogmes []={false,true,false,true,true};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}


