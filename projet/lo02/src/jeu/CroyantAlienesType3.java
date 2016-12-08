package jeu;

public class CroyantAlienesType3 extends CroyantAlienes{

	public CroyantAlienesType3(String nom, boolean ta[])
	{
		this.setNom(nom);
		this.setDescriptionCapacite("Empêche une Divinité possédant le Dogme Mystique ou Chaos de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		this.setCosmologie("Néant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
	}
	
	public void sacrifice()
	{
		
	}
}
