package jeu;

public class CroyantTravailleursType2 extends CroyantTravailleurs{
	
	public CroyantTravailleursType2(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		this.setDescriptionCapacite("Emp�che une Divinit� poss�dant le Dogme Chaos ou Mystique de sacrifier un de ses Guides Spirituels durant ce tour.");
		this.setCosmologie("Jour");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);	
	
	}
	
	public void sacrifice()
	{
		
	}

}
