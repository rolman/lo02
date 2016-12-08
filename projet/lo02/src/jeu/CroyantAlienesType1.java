package jeu;

public class CroyantAlienesType1 extends CroyantAlienes{
	
	public CroyantAlienesType1(String nom, boolean ta[])
	{
		this.setNom(nom);
		this.setDescriptionCapacite("Empêche une Divinité possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		this.setCosmologie("Néant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
	}
	
	public void sacrifice()
	{
		
	}

}
