package Divinite;



/**
 * <h1>DiviniteBrewalen</h1> 
 * Classe de la divinit� Brewalen.
 * @author Yvann et Mehdi
 * 
 * 
 */
public class DiviniteBrewalen extends Divinite {
	
	
	public DiviniteBrewalen(){
		this.setNom("Brewallen");
		this.setDescription("Premier enfant du Jour, Brewalen cherche � repr�senter une certaine image de l'harmonie, et tente de mettre en place un statu quo entre les Divinit�s.");
		this.setCosmologie("Jour");
		boolean tabDogmes []={true,true,true,false,false};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut emp�cher l'utilisation d'une carte Apocalypse. La carte est d�fauss�e.");
	
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}
