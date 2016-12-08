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
		this.setDogme(Dogme.Nature,true);
		this.setDogme(Dogme.Humain,true);
		this.setDogme(Dogme.Symboles,true);
		this.setDogme(Dogme.Mystique,false);
		this.setDogme(Dogme.Chaos,false);
		this.setCapacite("Peut emp�cher l'utilisation d'une carte Apocalypse. La carte est d�fauss�e.");
	
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}
