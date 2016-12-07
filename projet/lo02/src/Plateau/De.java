package Plateau;

import java.util.ArrayList;
import java.util.Iterator;

import Joueur.Joueur;
import Joueur.Participants;

public class De {

	public void lancerDe(ArrayList<Participants> joueurs) {

		int face = (int) Math.round((2) * Math.random()); // 0 = jour; 1 = Nuit;
															// 2 = Neant

		switch (face) {
		case 0:
			System.out.println("Le d� affiche jour !");
			break;
		case 1:
			System.out.println("Le d� affiche nuit !");
			break;
		case 2:
			System.out.println("Le d� affiche n�ant !");
			break;
		}

		for (int i = 0; i < joueurs.size(); i++) {

			String cosmologieJoueur = joueurs.get(i).getType().getCosmologie();
			switch (cosmologieJoueur) {
			case "Jour":
				if (face == 0)
					joueurs.get(i).ajoutPointActionJour(2);
				break;
			case "Nuit":
				if (face == 1)
					joueurs.get(i).ajoutPointActionNuit(2);
				break;
			case "Aube":
				if (face == 0)
					joueurs.get(i).ajoutPointActionJour(1);
				if (face == 2)
					joueurs.get(i).ajoutPointActionNeant(1);
				break;
			case "Crepuscule":
				if (face == 1)
					joueurs.get(i).ajoutPointActionNuit(1);
				if (face == 2)
					joueurs.get(i).ajoutPointActionNeant(1);
				break;
			}

			System.out.println(joueurs.get(i).getNom() + " a desormais :");
			System.out.println(joueurs.get(i).getPointActionJour() + " point(s) d'action Jour");
			System.out.println(joueurs.get(i).getPointActionNuit() + " point(s) d'action Nuit");
			System.out.println(joueurs.get(i).getPointActionNeant() + " point(s) d'action Neant");
		}
	}
}
