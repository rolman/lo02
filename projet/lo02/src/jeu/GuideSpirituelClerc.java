package jeu;

import java.util.LinkedList;

public class GuideSpirituelClerc extends GuideSpirituel{

	public GuideSpirituelClerc(String nom, boolean ta[], String cosmologie)
    {
        croyants = new LinkedList<>();
        this.setNom(nom);
		//this.setCapacite("Fait gagner un nombre de points d'Action �gal au nombre de cartes de Croyants rattach�es. L'Origine des points d'Action est au choix du joueur.");
		this.setDescriptionCapacite("Fait gagner un nombre de points d'Action �gal au nombre de cartes de Croyants rattach�es. L'Origine des points d'Action est au choix du joueur.");
		this.setCosmologie(cosmologie);
		this.setDogmes(ta);
		this.setNbDeCroyantsPouvantEtreGuides(2);
		
        
    }
	
}
