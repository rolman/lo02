package jeu;

public class CroyantRevolutionnaires extends Croyant{

	public CroyantRevolutionnaires(String nom, boolean ta[])
	{
		
		this.setNom(nom);
		//this.setCapacite("Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez. Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es.");
		this.setDescriptionCapacite("Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez. Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es.");
		this.setCosmologie("N�ant");
		this.setDogmes(ta);
		this.setNombreDeCroyants(2);
		
	}
}
