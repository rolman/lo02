package jeu;

public class CroyantAlchimistesType2 extends CroyantAlchimistes{
	
	public CroyantAlchimistesType2(String nom, boolean ta[])
	{
	
	this.setNom(nom);
	this.setDescriptionCapacite("Empêche une Divinité possédant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
	this.setCosmologie("Nuit");
	this.setDogmes(ta);
	this.setNombreDeCroyants(2);
	
	}
	
	public void sacrifice()
	{
		
	}

}
