package jeu;

public class CroyantVampire extends Croyant{

	public CroyantVampire(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifié. La capacité spéciale du sacrifice est jouée.";
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=1;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifié. La capacité spéciale du sacrifice est jouée.");
		this.setDescriptionCapacite("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifié. La capacité spéciale du sacrifice est jouée.");
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(1);
		
	}
}
