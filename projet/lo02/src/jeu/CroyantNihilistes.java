package jeu;

public class CroyantNihilistes extends Croyant{
	
	public CroyantNihilistes(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		//this.setCapacite("Jusqu'� la fin du tour, plus aucune Divinit� ne re�oit de points d'Action.");
		this.setDescriptionCapacite("Jusqu'� la fin du tour, plus aucune Divinit� ne re�oit de points d'Action.");
		this.setCosmologie("N�ant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(4);
		
	}

}
