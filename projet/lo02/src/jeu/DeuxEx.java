package jeu;

public class DeuxEx extends Carte{

	public final static int NOMBRE_DE_CARTES_DEUX_EX=18;
	
	public DeuxEx (String nom, String capacite,String cosmologie)
	{
		/*
		this.nom=nom;
		this.capacite=capacite;
		this.cosmologie=cosmologie;
		*/
		
		this.setNom(nom);
		//this.setCapacite(capacite);
		this.setDescriptionCapacite(capacite);
		this.setCosmologie(cosmologie);
	}
	
}
