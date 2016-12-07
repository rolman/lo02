package jeu;

import java.util.*;

import Divinite.Divinite;
import Joueur.Joueur;
import Joueur.Participants;

public class CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier extends Capacite{
	
	public CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier()
	{
		
	}

	public void sacrifice(ArrayList<Participants> joueurs)
	{
		joueurs = new ArrayList<Participants>();
		Iterator<Participants> it = joueurs.iterator();
		while(it.hasNext())
		{
			
			Joueur j =(Joueur)it.next();
			Divinite d = j.getType();
			if(d.getDogme("Nature")||d.getDogme("Mystique"))
		    {
				boolean b=false;
				j.setPeutJouer(b);
			}
			
		}
		
	}
	
}
