package jeu;

public class CroyantDemons extends Croyant {
	
	public CroyantDemons(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Donne un point d'action d'origine Nuit.";
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=2;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Donne un point d'action d'origine Nuit.");
		this.setDescriptionCapacite("Donne un point d'action d'origine Nuit.");
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}
}
