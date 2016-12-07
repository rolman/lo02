package jeu;

import java.util.Iterator;
import java.util.LinkedList;

public class GuideSpirituel extends Carte{
	
	public final static int NOMBRE_DE_CARTES_GUIDES_SPIRITUELS=20;
	
	private int nbDeCroyantsPouvantEtreGuides;
	
	LinkedList<Carte> croyants;
	
	public LinkedList<Carte> getCroyants() {
		return croyants;
	}

	public void infoCroyants() {
		int positionCroyant=0;
		for (Iterator it = croyants.iterator(); it.hasNext();) {

			Carte carte = (Carte) it.next();
			System.out.println(positionCroyant + "  " + carte.getNom()+ "    "+ carte.getDescriptionCapacite());
			positionCroyant++;
		}
	}

	public void setCroyants(LinkedList<Carte> croyants) {
		this.croyants = croyants;
	}

	public int getNbDeCroyantsPouvantEtreGuides() {
		return nbDeCroyantsPouvantEtreGuides;
	}

	public void setNbDeCroyantsPouvantEtreGuides(int nbDeCroyantsPouvantEtreGuides) {
		this.nbDeCroyantsPouvantEtreGuides = nbDeCroyantsPouvantEtreGuides;
	}

	public void ajoutCroyantGuide(Carte croyant) {
		croyants.add(croyant);
	}
	
	

}
