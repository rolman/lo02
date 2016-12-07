package jeu;

public class CroyantEsprits extends Croyant{
	
	public CroyantEsprits(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Donne un point d'Action d'Origine Néant.";
		this.cosmologie="Néant";
		this.dogmes=ta;
		this.nbCroyants=2;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Donne un point d'Action d'Origine Néant.");
		this.setDescriptionCapacite("Donne un point d'Action d'Origine Néant.");
		this.setCosmologie("Néant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}

}
