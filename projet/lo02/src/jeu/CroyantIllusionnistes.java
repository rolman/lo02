package jeu;

public class CroyantIllusionnistes extends Croyant{
	
	public CroyantIllusionnistes(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants appartenant � une autre Divinit�. La carte en question reste en jeu.";
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=4;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants appartenant � une autre Divinit�. La carte en question reste en jeu.");
		this.setDescriptionCapacite("Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants appartenant � une autre Divinit�. La carte en question reste en jeu.");
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}
}
