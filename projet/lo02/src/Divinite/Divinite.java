package Divinite;


public abstract class Divinite {

	// private list dogme;
	private String nom;
	private String description;
	private String cosmologie;
	private String capacite;
	private boolean dogmes[];
	
	// Récupère le nom
	public String getNom() {
		return nom;
	}

	// Affecte un nom
	public void setNom(String nouvNom) {
		nom = nouvNom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String nouvDescription) {
		description = nouvDescription;
	}
	
	public String getCosmologie() {
		return cosmologie;
	}

	public void setCosmologie(String nouvCosmologie) {
		cosmologie = nouvCosmologie;
	}
	
	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}


	/*public boolean getDogme(String nom) {
		boolean dogme = false;

		switch (nom) {

		case "Nature":
			dogme = Dogme.Nature.possede;
			break;
		case "Humain":
			dogme = Dogme.Humain.possede;
			break;
		case "Symboles":
			dogme = Dogme.Symboles.possede;
			break;
		case "Mystique":
			dogme = Dogme.Mystique.possede;
			break;
		case "Chaos":
			dogme = Dogme.Chaos.possede;
			break;

		}
		return dogme;
	}*/

	/*public void setDogme(Dogme nom, boolean dogme) {

		switch (nom) {

		case Nature:
			Dogme.Nature.possede = dogme;
			break;
		case Humain:
			Dogme.Humain.possede = dogme;
			break;
		case Symboles:
			Dogme.Symboles.possede = dogme;
			break;
		case Mystique:
			Dogme.Mystique.possede = dogme;
			break;
		case Chaos:
			Dogme.Chaos.possede = dogme;
			break;

		}

	}*/



/*	public enum Dogme {
		Nature("Nature", false), Humain("Humain", false), Symboles("Symboles", false), Mystique("Mystique",
				false), Chaos("Chaos", false);

		
		private boolean possede;

		Dogme(String nom, boolean possede) {
			
			this.possede = possede;
		}

	};*/


	public abstract void capacite();

	public boolean getDogmes(int i) {
		return dogmes[i];
	}

	public void setDogmes(boolean dogmes[]) {
		this.dogmes = dogmes;
	}

	

	

}
