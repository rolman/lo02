package jeu;

public class CroyantTravailleurs extends Croyant {

	public CroyantTravailleurs(String nom, boolean ta[],String descriptionCapacite,Capacite capacite)
	{
		/*
		this.nom=nom;
		this.capacite=capacite;
		this.cosmologie="Jour";
		this.dogmes=ta;
		this.nbCroyants=2;
		*/
		
		this.setNom(nom);
		this.setCapacite(capacite);
		this.setDescriptionCapacite(descriptionCapacite);
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
		
	}
}
