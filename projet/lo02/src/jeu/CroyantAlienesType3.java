package jeu;

public class CroyantAlienesType3 extends CroyantAlienes{

	public CroyantAlienesType3(String nom, boolean ta[])
	{
		this.setNom(nom);
		this.setDescriptionCapacite("Emp�che une Divinit� poss�dant le Dogme Mystique ou Chaos de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		this.setCosmologie("N�ant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
	}
	
	public void sacrifice()
	{
		
	}
}
