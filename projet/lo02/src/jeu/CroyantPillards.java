package jeu;

public class CroyantPillards extends Croyant{

	
	public CroyantPillards(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour. Les points d'Action gardent leur Origine. La Divinit� perd ses points.";
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=4;
		*/
		
		this.setNom(nom);
		//this.setCapacite("R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour. Les points d'Action gardent leur Origine. La Divinit� perd ses points.");
		this.setDescriptionCapacite("R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour. Les points d'Action gardent leur Origine. La Divinit� perd ses points.");
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}
}
