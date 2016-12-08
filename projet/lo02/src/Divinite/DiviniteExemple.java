package Divinite;



public class DiviniteExemple  extends Divinite {

	public DiviniteExemple(){
		this.setNom("");
		this.setDescription("");
		this.setCosmologie("");
		this.setDogme(Dogme.Nature,false);
		this.setDogme(Dogme.Humain,false);
		this.setDogme(Dogme.Symboles,false);
		this.setDogme(Dogme.Mystique,false);
		this.setDogme(Dogme.Chaos,false);
		this.setCapacite("");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}


