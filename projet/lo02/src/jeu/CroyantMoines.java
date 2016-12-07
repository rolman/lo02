package jeu;

import Joueur.Joueur;

public class CroyantMoines extends Croyant{
	
	
	public CroyantMoines(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Donne un point d'Action d'Origine Jour.";
		this.cosmologie="Jour";
		this.dogmes=ta;
		this.nbCroyants=2;
		*/
		
		CapaciteAjoutUnPointActionJour CapaciteAjoutUnPointActionJour1 = new CapaciteAjoutUnPointActionJour();
		
		this.setNom(nom);
		this.setCapacite(CapaciteAjoutUnPointActionJour1);
		this.setDescriptionCapacite("Donne un point d'Action d'Origine Jour.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}
	

}
