package Joueur;

import java.util.Iterator;
import java.util.LinkedList;

import Divinite.Divinite;
import Plateau.Pioche;
import jeu.Carte;

public class JoueurVirtuel extends Participants implements Strategy {
	private int pointAction;
	private String nom;
	private LinkedList<Carte> main;
	public LinkedList<Carte> getMain() {
		return main;
	}


	
	private  Divinite type;
	public Divinite getType() {
		return type;
	}

	
	public void voirMain()
	{
		
		for(Iterator it = main.iterator();it.hasNext(); )
		{
			
			Carte carte = (Carte) it.next();
			System.out.println(carte.getNom());
		}
		
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setType(Divinite nouvType) {
		this.type = nouvType;
	}
	
	/*public JoueurVirtuel(Divinite divinite){
		type = divinite;
	}*/
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public JoueurVirtuel(Divinite nomDiv, int numeroJoueur){
		main = new LinkedList<>();
		this.type = nomDiv;
		StringBuffer sb = new StringBuffer();
		sb.append("Joueur Virtuel ");
		sb.append(numeroJoueur);
		this.nom=sb.toString();
		for (int i = 0; i < 7; i++) {
			this.main.add(Pioche.getInstance().tirerCarteDuDessus());
		}
		
		for(Iterator it = main.iterator();it.hasNext(); )
		{
			
			Carte carte = (Carte) it.next();
			
			
		}
	}
	@Override
	public void Jouer() {
		System.out.println();
		System.out.println(nom + " joue");
		
	}
	public int getPointAction() {
		return pointAction;
	}
	public void setPointAction(int pointAction) {
		this.pointAction = pointAction;
	}
	


	@Override
	public int getPointActionJour() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getPointActionNuit() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getPointActionNeant() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void ajoutPointActionJour(int pointActionJour) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ajoutPointActionNuit(int pointActionNuit) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ajoutPointActionNeant(int pointActionNeant) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void seDefausser() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void completerMain() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void jouerCarte() {
		// TODO Auto-generated method stub
		
	}
}
