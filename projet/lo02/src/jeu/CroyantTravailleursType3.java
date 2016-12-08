package jeu;

public class CroyantTravailleursType3 extends CroyantTravailleurs{
	
	public CroyantTravailleursType3(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		this.setDescriptionCapacite("Vous piochez deux cartes au hasard dans la main d'une autre Divinité.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);	
	
	}
	
	public void sacrifice()
	{
		
	}

}
