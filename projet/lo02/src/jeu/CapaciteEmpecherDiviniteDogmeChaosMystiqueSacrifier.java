package jeu;

import java.util.ArrayList;
import java.util.Iterator;

import Divinite.Divinite;
import Joueur.Joueur;
import Joueur.Participants;

public class CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier extends Capacite{
	
	public CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier()
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
			if(d.getDogmes(3)||d.getDogmes(4))
		    {
				boolean b=false;
				j.setPeutJouer(b);
			}
			
		}
		
	}

}
