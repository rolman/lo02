package jeu;

import java.util.LinkedList;

public class GuideSpirituelMartyr extends GuideSpirituel {


	    
	    public GuideSpirituelMartyr(String nom, boolean ta[], String cosmologie)
	    {
	    	/*
	    	croyants = new LinkedList<>();
	        this.nom=nom;
	        this.capacite="Equivalent � la pose d'une carte Apocalypse";
	        this.cosmologie=cosmologie;
	        this.dogmes=ta;
	        this.setNbDeCroyantsPouvantEtreGuides(2);
	        */
	    	
	        croyants = new LinkedList<>();
	        this.setNom(nom);
			//this.setCapacite("Equivalent � la pose d'une carte Apocalypse");
			this.setDescriptionCapacite("Equivalent � la pose d'une carte Apocalypse");
			this.setCosmologie(cosmologie);
			this.setDogmes(ta);
			this.setNbDeCroyantsPouvantEtreGuides(2);
			
	        
	    }


}
