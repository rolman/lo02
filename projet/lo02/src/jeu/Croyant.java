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
	
	public void sacrifice()
	{
		
	}
	
}
