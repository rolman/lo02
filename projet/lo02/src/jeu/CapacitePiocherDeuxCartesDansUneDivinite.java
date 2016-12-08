package jeu;

import java.util.*;
import Joueur.Joueur;
import Joueur.Participants;
import Plateau.Partie;

public class CapacitePiocherDeuxCartesDansUneDivinite extends Capacite{
	
	public CapacitePiocherDeuxCartesDansUneDivinite()
	{
		
	}
	
	public void sacrificePiocheDeuxCartesDansUneDivinite(Joueur joueur)
	{
		System.out.println("A quelle divinité voulez-vous prendre deux cartes ?");
		
		for(int i = 0; i<Partie.getJoueurs().size();i++)
		{
			System.out.println(i+" "+Partie.getJoueurs().get(i).getType().getNom());
		}
		
		System.out.println("Quel est votre choix ?");
		
		Scanner sc = new Scanner(System.in);
		
		int choix = sc.nextInt();
		
		
		if(joueur.getMain().size()<5 && Partie.getJoueurs().get(choix).getMain().size()>2)
		{
		for(int ia=0;ia<2;ia++)
		{
			int carteARetirer =(int) Math.round(Math.random()*Partie.getJoueurs().get(choix).getMain().size());
			joueur.getMain().add(Partie.getJoueurs().get(choix).getMain().remove(carteARetirer));
		}
		System.out.println("L'action a été effectuée.");
		}
		
		else
		{
			System.out.println("L'action ne peut pas être effectuée");
			
		}
	}

}
