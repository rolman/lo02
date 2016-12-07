package jeu;

public class CroyantAlchimistes extends Croyant{

	
	public CroyantAlchimistes(String nom, boolean ta[], String capacite)
	{
		/*
		this.nom=nom;
		this.capacite=capacite;
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=2;
		*/
		
		this.setNom(nom);
		//this.setCapacite(capacite);
		this.setDescriptionCapacite(capacite);
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}
}
