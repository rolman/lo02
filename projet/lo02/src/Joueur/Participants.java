package Joueur;

import java.util.LinkedList;

import Divinite.Divinite;
import jeu.Carte;

public class Participants {
	
	private LinkedList<jeu.GuideSpirituel> fideles;
	
	public Divinite getType() {
		return null;
		
	}
	//public void setType(Divinite divinite);

	public void setType(Divinite type){
		
	}
	
	public void Jouer(){
		
	}
	
	
	
	public String getNom(){
		return null;
		
	}
	
	public int getPointActionJour(){
		return 0;
		
	}
	public int getPointActionNuit(){
		return 0;
		
	}
	public int getPointActionNeant(){
		return 0;
		
	}

	public void ajoutPointActionJour(int pointActionJour){
		
	}
	
	public void ajoutPointActionNuit(int pointActionNuit){
		
	}
	
	public void ajoutPointActionNeant(int pointActionNeant){
		
	}
	
	public void voirMain(){
		
	}
	
	public LinkedList<Carte> getMain(){
		return null;
		
	}
	
	public int puissancePriere(){
		int puissance=0;
		
		for(int i=0;i<this.fideles.size();i++){
			for(int j=0;i<this.fideles.get(i).getCroyants().size();j++){
				puissance++;
			}
		}
		
		return puissance;
	}
}
