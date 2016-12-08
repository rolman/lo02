package Plateau;

import java.util.Iterator;
import java.util.LinkedList;

import jeu.Carte;

public class Plateau {
	
	private LinkedList<Carte> tasDeCartesTable;

	public LinkedList<Carte> getTasDeCartesTable() {
		return tasDeCartesTable;
	}

	public void setTasDeCartesTable(LinkedList<Carte> tasDeCartesTable) {
		this.tasDeCartesTable = tasDeCartesTable;
	}


	private static Plateau INSTANCE = new Plateau();

	public static Plateau getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Plateau();
		}
		return INSTANCE;
	}

	private Plateau() {
		tasDeCartesTable = new LinkedList<Carte>();
	}
	
	
	public  void poserCarte(Carte carte)
	{
		
		tasDeCartesTable.addLast(carte);
	}
	
	public void voirPlateau() {
		int position = 0;
		for (Iterator it = tasDeCartesTable.iterator(); it.hasNext();) {

			Carte carte = (Carte) it.next();
			System.out.println(position + "  " + carte.getNom()+"      "+java.util.Arrays.toString(carte.getDogmes()));
			position++;
		}

	}
	


}
