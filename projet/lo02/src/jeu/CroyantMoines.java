package jeu;

import Joueur.Joueur;
import Plateau.Partie;

public class CroyantMoines extends Croyant{
	
	
	public CroyantMoines(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		this.setDescriptionCapacite("Donne un point d'Action d'Origine Jour.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}
	
	public void sacrifice()
	{
		//Joueur j = Partie.getJoueurs().
		//this.CapaciteAjoutUnPointActionJour(j);
	}
	
	public void CapaciteAjoutUnPointActionJour(Joueur j)
	{
		j.ajoutPointActionJour(1);
	}
	

}
