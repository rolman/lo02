package jeu;

public class CroyantErmite extends Croyant {

	public CroyantErmite(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Impose le sacrifice d'un Croyant d'un autre joueur qui choisiti la carte. La capacite sp�ciale du sacrifice est jou�e";
		this.cosmologie="Jour";
		this.dogmes=ta;
		this.nbCroyants=1;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Impose le sacrifice d'un Croyant d'un autre joueur qui choisiti la carte. La capacite sp�ciale du sacrifice est jou�e");
		this.setDescriptionCapacite("Impose le sacrifice d'un Croyant d'un autre joueur qui choisiti la carte. La capacite sp�ciale du sacrifice est jou�e");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(1);
		
	}
	
}
