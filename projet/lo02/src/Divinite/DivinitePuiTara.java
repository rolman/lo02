package Divinite;


public class DivinitePuiTara   extends Divinite {

	public DivinitePuiTara(){
		this.setNom("Pui-Tara");
		this.setDescription("Pui-Tara est la Divinit� sur laquelle l'influence de la Nuit s'est faite la plus forte.");
		this.setCosmologie("Nuit");
		boolean tabDogmes []={true,false,true,true,false};
		this.setDogmes(tabDogmes);
		this.setCapacite("Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine Jour.");
	}
	
	@Override
	public void capacite() {
		// TODO coder la capacit�
		
	}
}
