package Divinite;

public class DiviniteGorpa  extends Divinite {

	public DiviniteGorpa(){
		this.setNom("Gorpa");
		this.setDescription("Divinité joueuse et espiègle, Gorpa aime gêner ses consoeurs dans leur recherche de puissance.");
		this.setCosmologie("Crepuscule");
		boolean tabDogmes []={false,true,true,false,true};//nature, humain, symbole, mystique, chaos
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut récupérer les points d'Action d'une autre Divinité en plus des siens. L'autre Divinité ne reçoit aucun point d'Action ce tour-ci.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacité
		
	}
}


