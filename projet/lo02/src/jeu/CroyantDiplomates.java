package jeu;

public class CroyantDiplomates extends Croyant{
	
	public CroyantDiplomates(String nom, boolean ta[])
	{
		/*
		this.nom=nom;
		this.capacite="Relancez le d� de Cosmologie. Le tour se finit normalement sous la nouvelle influence.";
		this.cosmologie="Jour";
		this.dogmes=ta;
		this.nbCroyants=4;
		*/
		
		this.setNom(nom);
		//this.setCapacite("Relancez le d� de Cosmologie. Le tour se finit normalement sous la nouvelle influence.");
		this.setDescriptionCapacite("Relancez le d� de Cosmologie. Le tour se finit normalement sous la nouvelle influence.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}

}
