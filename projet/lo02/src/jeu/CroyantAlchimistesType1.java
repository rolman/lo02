package jeu;

public class CroyantAlchimistesType1 extends CroyantAlchimistes{
	
	public CroyantAlchimistesType1(String nom, boolean ta[])
	{
	
	this.setNom(nom);
	this.setDescriptionCapacite("Empêche une Divinité possédant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
	this.setCosmologie("Nuit");
	this.setDogmes(ta);
	this.setNombreDeCroyants(2);
	
	}
	
	public void sacrifice()
	{
		
	}

}
