package jeu;

public class CroyantAlienesType1 extends CroyantAlienes{
	
	public CroyantAlienesType1(String nom, boolean ta[])
	{
		this.setNom(nom);
		this.setDescriptionCapacite("Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		this.setCosmologie("N�ant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
	}
	
	public void sacrifice()
	{
		
	}

}
