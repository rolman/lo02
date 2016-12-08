package jeu;

import Joueur.Joueur;

public class CapaciteAjoutUnPointActionJour extends Capacite{
	
	public CapaciteAjoutUnPointActionJour()
	{
		
	}
	
	public void sacrifice(Joueur j)
	{
		j.ajoutPointActionJour(1);
	}

}
