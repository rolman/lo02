package jeu;

public class CroyantLycanthropes extends Croyant{

	public CroyantLycanthropes(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�.";
		this.cosmologie="Nuit";
		this.dogmes=ta;
		this.nbCroyants=4;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�.");
		this.setDescriptionCapacite("Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est d�fauss�.");
		this.setCosmologie("Nuit");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}
}
