package jeu;

public class CroyantGuerriersSaints extends Croyant {

	public CroyantGuerriersSaints(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent sur la table.";
		this.cosmologie="Jour";
		this.dogmes=ta;
		this.nbCroyants=4;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent sur la table.");
		this.setDescriptionCapacite("Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent sur la table.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}
	
}
