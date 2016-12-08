package jeu;

public class CroyantAlchimistesType3 extends CroyantAlchimistes{

	public CroyantAlchimistesType3(String nom, boolean ta[])
	{
	
	this.setNom(nom);
	this.setDescriptionCapacite("Vous piochez deux cartes au hasard dans la main d'une autre Divinité.");
	this.setCosmologie("Nuit");
	this.setDogmes(ta);
	this.setNombreDeCroyants(2);
	
	}
	
	public void sacrifice()
	{
		
	}
	
	
	
}
