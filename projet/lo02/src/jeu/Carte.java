package jeu;

public class Carte {

	public final static int NOMBRE_TOTAL_DE_CARTES = Apocalypse.NOMBRE_DE_CARTES_APOCALYPSES + Croyant.NOMBRE_DE_CARTES_CROYANTS + DeuxEx.NOMBRE_DE_CARTES_DEUX_EX + GuideSpirituel.NOMBRE_DE_CARTES_GUIDES_SPIRITUELS;
	
	private String nom;
	private String cosmologie;
	private boolean dogmes[];
	private String description="blablabla";
	private String descriptionCapacite="blablabla";
	
	//LES GETTERS
	public String getNom(){
		return nom;
	}
	
	public String getCosmologie(){
		return cosmologie;
	}
	
	public boolean[] getDogmes(){
		return dogmes;
	}
	
	public boolean getDogmes(int i){
		return dogmes[i];
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public String getDescriptionCapacite() {
		return descriptionCapacite;
	}
	
	//LES SETTERS
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	public void setCosmologie(String cosmologie)
	{
		this.cosmologie=cosmologie;
	}
	
	public void setDogmes(boolean ta[])
	{
		this.dogmes=ta;
	}
	
	
	
	public void setDescription(String description) {
		this.description = description;
	}


	public void setDescriptionCapacite(String descriptionCapacite) {
		this.descriptionCapacite = descriptionCapacite;
	}
	
	
	
	
	
	
	public int getNbDeCroyantsPouvantEtreGuides() {
		return 0;
	}
	
	public void ajoutCroyantGuide(Carte croyant) {
		
	}
	
    public void sacrifice(){
		
	}
	
}
