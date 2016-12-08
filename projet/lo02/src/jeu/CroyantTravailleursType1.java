package jeu;

public class CroyantTravailleursType1 extends CroyantTravailleurs{
	
	
	public CroyantTravailleursType1(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		this.setDescriptionCapacite("Empêche une Divinité possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);	
	
	}
	
	public void sacrifice()
	{
		
	}
	
	

}
