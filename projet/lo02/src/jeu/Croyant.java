package jeu;

public class Croyant extends Carte{
	
	public final static int NOMBRE_DE_CARTES_CROYANTS=37;
	
	private int nbCroyants;
	
	
	public int getNombreDeCroyants(){
		return nbCroyants;
		
	}
	
	public void setNombreDeCroyants(int ia)
	{
		this.nbCroyants=ia;
	}
	
	
	
	
	//@override
	public void sacrifice(){
		
	}

	

	
	
	/*public Croyant(String nom, String capacite, String cosmologie, boolean ta[], int nbCroyants)
	{
		this.nom=nom;
		this.capacite=capacite;
		this.cosmologie=cosmologie;
		this.dogmes=ta;
		this.nbCroyants=nbCroyants;
	}
	*/
	
}
