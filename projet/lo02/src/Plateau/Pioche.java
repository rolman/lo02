package Plateau;
import java.util.*;

import jeu.Apocalypse;
import jeu.CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier;
import jeu.CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier;
import jeu.CapacitePiocherDeuxCartesDansUneDivinite;
import jeu.Carte;
import jeu.CroyantAlchimistes;
import jeu.CroyantAlienes;
import jeu.CroyantDemons;
import jeu.CroyantDiplomates;
import jeu.CroyantErmite;
import jeu.CroyantEsprits;
import jeu.CroyantGuerriersSaints;
import jeu.CroyantIllusionnistes;
import jeu.CroyantIntegristes;
import jeu.CroyantLycanthropes;
import jeu.CroyantMoines;
import jeu.CroyantNihilistes;
import jeu.CroyantPillards;
import jeu.CroyantRevenant;
import jeu.CroyantRevolutionnaires;
import jeu.CroyantTravailleurs;
import jeu.CroyantVampire;
import jeu.DeuxEx;
import jeu.GuideSpirituel;
import jeu.GuideSpirituelClerc;
import jeu.GuideSpirituelMartyr;


public class Pioche {

	private LinkedList<Carte> tasDeCartes;
	
	public LinkedList<Carte> getTasDeCartes() {
		return tasDeCartes;
	}


	public void setTasDeCartes(LinkedList<Carte> tasDeCartes) {
		this.tasDeCartes = tasDeCartes;
	}


	private static Pioche INSTANCE = new Pioche();
	
	public static Pioche getInstance(){
		if (INSTANCE == null)
	{ 	INSTANCE = new Pioche();	
	}
	return INSTANCE;
	}
	
	private Pioche()
	{
		tasDeCartes = new LinkedList<Carte>();
		
 //CREATION DES GUIDES SPIRITUELS ET AJOUT DANS LA PIOCHE
        
        //CREATION DES GUIDES SPIRITUELS MARTYR
        boolean tabGuideMartyr1[]={true,true,false,false,false};
        GuideSpirituelMartyr GuideSpirituelMartyr1= new GuideSpirituelMartyr("Guide Spirituel Martyr1",tabGuideMartyr1,"Jour");
        tasDeCartes.add(GuideSpirituelMartyr1);
        
        boolean tabGuideSpirituelMartyr2[]={false,true,true,false,false};
        GuideSpirituelMartyr GuideSpirituelMartyr2= new GuideSpirituelMartyr("Guide Spirituel Martyr2",tabGuideSpirituelMartyr2,"Nuit");
        tasDeCartes.add(GuideSpirituelMartyr2);
        
        boolean tabGuideSpirituelMartyr3[]={true,false,false,false,true};
        GuideSpirituelMartyr GuideSpirituelMartyr3= new GuideSpirituelMartyr("Guide Spirituel Martyr3",tabGuideSpirituelMartyr3,"Néant");
        tasDeCartes.add(GuideSpirituelMartyr3);

		//CREATION DES GUIDES SPIRITUELS CLERC
        boolean tabGuideSpirituelClerc1[]={false,true,false,false,true};
        GuideSpirituelClerc GuideSpirituelClerc1= new GuideSpirituelClerc("Guide Spirituel Clerc1",tabGuideSpirituelClerc1,"Jour");
        tasDeCartes.add(GuideSpirituelClerc1);
        
        boolean tabGuideSpirituelClerc2[]={true,false,true,false,false};
        GuideSpirituelClerc GuideSpirituelClerc2= new GuideSpirituelClerc("Guide Spirituel Clerc2",tabGuideSpirituelClerc2,"Nuit");
        tasDeCartes.add(GuideSpirituelClerc2);
        
        boolean tabGuideSpirituelClerc3[]={true,false,false,true,false};
        GuideSpirituelClerc GuideSpirituelClerc3= new GuideSpirituelClerc("Guide Spirituel Clerc3",tabGuideSpirituelClerc3,"Néant");
        tasDeCartes.add(GuideSpirituelClerc3);
        
        boolean tabGuideSpirituelClerc4[]={true,false,false,false,true};
        GuideSpirituelClerc GuideSpirituelClerc4= new GuideSpirituelClerc("Guide Spirituel Clerc4",tabGuideSpirituelClerc4,"Jour");
        tasDeCartes.add(GuideSpirituelClerc4);
        
        boolean tabGuideSpirituelClerc5[]={false,false,true,true,false};
        GuideSpirituelClerc GuideSpirituelClerc5= new GuideSpirituelClerc("Guide Spirituel Clerc5",tabGuideSpirituelClerc5,"Nuit");
        tasDeCartes.add(GuideSpirituelClerc5);
        
        boolean tabGuideSpirituelClerc6[]={false,false,true,false,true};
        GuideSpirituelClerc GuideSpirituelClerc6= new GuideSpirituelClerc("Guide Spirituel Clerc6",tabGuideSpirituelClerc6,"Néant");
        tasDeCartes.add(GuideSpirituelClerc6);
        
        boolean tabGuideSpirituelClerc7[]={false,false,false,true,true};
        GuideSpirituelClerc GuideSpirituelClerc7= new GuideSpirituelClerc("Guide Spirituel Clerc7",tabGuideSpirituelClerc7,"Jour");
        tasDeCartes.add(GuideSpirituelClerc7);
        
        boolean tabGuideSpirituelClerc8[]={true,true,false,false,false};
        GuideSpirituelClerc GuideSpirituelClerc8= new GuideSpirituelClerc("Guide Spirituel Clerc8",tabGuideSpirituelClerc8,"Jour");
        tasDeCartes.add(GuideSpirituelClerc8);
        
        
        
        
//CREATION DES CROYANTS ET AJOUT DANS LA PIOCHE
		
		//CREATION DES CROYANTS MOINES
		boolean tabCroyantMoines1[]={true,true,false,true,false};
		//Croyant CroyantMoine1= new Croyant("Croyant Moine1","Donne un point d'action d'origine jour.","Jour",tabCroyantMoine1,2);
		CroyantMoines CroyantMoines1= new CroyantMoines("Croyant Moines1",tabCroyantMoines1);
		tasDeCartes.add(CroyantMoines1);
		
		boolean tabCroyantMoines2[]={false,true,false,true,true};
		//Croyant CroyantMoine2= new Croyant("Croyant Moine2","Donne un point d'action d'origine jour.","Jour",tabCroyantMoine2,2);
		CroyantMoines CroyantMoines2= new CroyantMoines("Croyant Moines2",tabCroyantMoines2);
		tasDeCartes.add(CroyantMoines2);
		
		boolean tabCroyantMoines3[]={false,false,true,true,true};
		CroyantMoines CroyantMoines3= new CroyantMoines("Croyant Moines3", tabCroyantMoines3);
		tasDeCartes.add(CroyantMoines3);
		
		boolean tabCroyantMoines4[]={true,false,true,true,false};
		CroyantMoines CroyantMoines4= new CroyantMoines("Croyant Moines4", tabCroyantMoines4);
		tasDeCartes.add(CroyantMoines4);
		
		boolean tabCroyantMoines5[]={true,false,false,true,true};
		CroyantMoines CroyantMoines5= new CroyantMoines("Croyant Moines5", tabCroyantMoines5);
		tasDeCartes.add(CroyantMoines5);
		
		//CREATION DES CROYANTS TRAVAILLEURS
		boolean tabCroyantTravailleurs1[]={false,true,true,false,true};
		CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier1 = new CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier();
		CroyantTravailleurs CroyantTravailleurs1= new CroyantTravailleurs("Croyant Travailleurs1", tabCroyantTravailleurs1,"Empêche une Divinité possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour.",CapaciteEmpecherDiviniteDogmeNatureMystiqueSacrifier1);
		tasDeCartes.add(CroyantTravailleurs1);
		
		boolean tabCroyantTravailleurs2[]={true,true,true,false,false};
		CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier1 = new CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier();
		CroyantTravailleurs CroyantTravailleurs2= new CroyantTravailleurs("Croyant Travailleurs2", tabCroyantTravailleurs2,"Empêche une Divinité possédant le Dogme Chaos ou Mystique de sacrifier un de ses Guides Spirituels durant ce tour.",CapaciteEmpecherDiviniteDogmeChaosMystiqueSacrifier1);
		tasDeCartes.add(CroyantTravailleurs2);
		
		boolean tabCroyantTravailleurs3[]={false,true,false,true,true};
		CapacitePiocherDeuxCartesDansUneDivinite CapacitePiocherDeuxCartesDansUneDivinite1 = new CapacitePiocherDeuxCartesDansUneDivinite();
		CroyantTravailleurs CroyantTravailleurs3= new CroyantTravailleurs("Croyant Travailleurs3", tabCroyantTravailleurs3,"Vous piochez deux cartes au hasard dans la main d'une autre Divinité.",CapacitePiocherDeuxCartesDansUneDivinite1);
		tasDeCartes.add(CroyantTravailleurs3);
		
		//CREATION DES CROYANTS ERMITE
		boolean tabCroyantErmite1[]={true,false,false,true,true};
		CroyantErmite CroyantErmite1 = new CroyantErmite("Croyant Ermite1", tabCroyantErmite1);
		tasDeCartes.add(CroyantErmite1);
		
		boolean tabCroyantErmite2[]={true,false,true,true,false};
		CroyantErmite CroyantErmite2 = new CroyantErmite("Croyant Ermite2", tabCroyantErmite2);
		tasDeCartes.add(CroyantErmite2);
		
		//CREATION DU CROYANT INTEGRISTES
		boolean tabCroyantIntegriste1[]={true,true,false,false,true};
		CroyantIntegristes CroyantIntegriste1 = new CroyantIntegristes("Croyant Integristes", tabCroyantIntegriste1);
		tasDeCartes.add(CroyantIntegriste1);
		
		//CREATION DU CROYANT GUERRIERS SAINTS
		boolean tabCroyantGuerriersSaints[]={true,false,true,true,false};
		CroyantGuerriersSaints CroyantGuerriersSaints1 = new CroyantGuerriersSaints("Croyant Guerriers Saints", tabCroyantGuerriersSaints);
		tasDeCartes.add(CroyantGuerriersSaints1);
		
		//CREATION DU CROYANT DIPLOMATES
		boolean tabCroyantDiplomates[]={false,true,true,false,true};
		CroyantDiplomates CroyantDiplomates1 = new CroyantDiplomates("Croyant Diplomates", tabCroyantDiplomates);
		tasDeCartes.add(CroyantDiplomates1);
		
		//CREATION DES CROYANTS DEMONS
		boolean tabCroyantDemon1[]={true,true,false,true,false};
		CroyantDemons CroyantDemons1 = new CroyantDemons("Croyant Demons1", tabCroyantDemon1);
		tasDeCartes.add(CroyantDemons1);
		
		boolean tabCroyantDemon2[]={false,true,false,true,true};
		CroyantDemons CroyantDemons2 = new CroyantDemons("Croyant Demons2", tabCroyantDemon2);
		tasDeCartes.add(CroyantDemons2);
		
		boolean tabCroyantDemon3[]={false,false,true,true,true};
		CroyantDemons CroyantDemons3 = new CroyantDemons("Croyant Demons3", tabCroyantDemon3);
		tasDeCartes.add(CroyantDemons3);
		
		boolean tabCroyantDemon4[]={true,false,true,true,false};
		CroyantDemons CroyantDemons4 = new CroyantDemons("Croyant Demons4", tabCroyantDemon4);
		tasDeCartes.add(CroyantDemons4);
		
		boolean tabCroyantDemon5[]={true,false,false,true,true};
		CroyantDemons CroyantDemons5 = new CroyantDemons("Croyant Demons5", tabCroyantDemon5);
		tasDeCartes.add(CroyantDemons5);
		
		//CREATION DES CROYANTS ALCHIMISTES
		boolean tabCroyantAlchimistes1[]={true,false,true,false,true};
		CroyantAlchimistes CroyantAlchimistes1 = new CroyantAlchimistes("Croyant Alchimiste1", tabCroyantAlchimistes1,"Empêche une Divinité possédant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		tasDeCartes.add(CroyantAlchimistes1);
		
		boolean tabCroyantAlchimistes2[]={true,false,false,true,true};
		CroyantAlchimistes CroyantAlchimistes2 = new CroyantAlchimistes("Croyant Alchismiste2", tabCroyantAlchimistes2,"Empêche une Divinité possédant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		tasDeCartes.add(CroyantAlchimistes2);
		
		boolean tabCroyantAlchimistes3[]={true,false,false,true,true};
		CroyantAlchimistes CroyantAlchimistes3 = new CroyantAlchimistes("Croyant Alchismiste3", tabCroyantAlchimistes3,"Vous piochez deux cartes au hasard dans la main d'une autre Divinité.");
		tasDeCartes.add(CroyantAlchimistes3);
		
		//CREATION DES CROYANTS VAMPIRES
		boolean tabCroyantVampire1[]={true,true,true,false,false};
		CroyantVampire CroyantVampire1 = new CroyantVampire("Croyant Vampire1", tabCroyantVampire1);
		tasDeCartes.add(CroyantVampire1);
		
		boolean tabCroyantVampire2[]={false,true,false,true,true};
		CroyantVampire CroyantVampire2 = new CroyantVampire("Croyant Vampire2", tabCroyantVampire2);
		tasDeCartes.add(CroyantVampire2);
		
		//CREATION DU CROYANT LYCANTHROPES
		boolean tabCroyantLycanthropes1[]={true,true,false,false,true};
		CroyantLycanthropes CroyantLycanthropes1 = new CroyantLycanthropes("Croyant Lycanthropes", tabCroyantLycanthropes1);
		tasDeCartes.add(CroyantLycanthropes1);
		
		//CREATION DU CROYANT PILLARDS
		boolean tabCroyantPillards1[]={true,false,true,true,false};
		CroyantPillards CroyantPillards1 = new CroyantPillards("Croyant Pillards", tabCroyantPillards1);
		tasDeCartes.add(CroyantPillards1);
		
		//CREATION DU CROYANT ILLUSIONNISTES
		boolean tabCroyantIllusionnistes1[]={false,true,true,false,true};
		CroyantIllusionnistes CroyantIllusionnistes1 = new CroyantIllusionnistes("Croyant Illusionnistes", tabCroyantIllusionnistes1);
		tasDeCartes.add(CroyantIllusionnistes1);
		
		//CREATION DES CROYANTS ESPRITS
		boolean tabCroyantEsprits1[]={true,true,false,true,false};
		CroyantEsprits CroyantEsprits1 = new CroyantEsprits("Croyant Esprits1", tabCroyantEsprits1);
		tasDeCartes.add(CroyantEsprits1);
		
		boolean tabCroyantEsprits2[]={false,true,false,true,true};
		CroyantEsprits CroyantEsprits2 = new CroyantEsprits("Croyant Esprits2", tabCroyantEsprits2);
		tasDeCartes.add(CroyantEsprits2);
		
		boolean tabCroyantEsprits3[]={false,false,true,true,true};
		CroyantEsprits CroyantEsprits3 = new CroyantEsprits("Croyant Esprits3", tabCroyantEsprits3);
		tasDeCartes.add(CroyantEsprits3);
		
		boolean tabCroyantEsprits4[]={true,false,true,true,false};
		CroyantEsprits CroyantEsprits4 = new CroyantEsprits("Croyant Esprits4", tabCroyantEsprits4);
		tasDeCartes.add(CroyantEsprits4);
		
		boolean tabCroyantEsprits5[]={true,false,false,true,true};
		CroyantEsprits CroyantEsprits5 = new CroyantEsprits("Croyant Esprits5", tabCroyantEsprits5);
		tasDeCartes.add(CroyantEsprits5);
		
		//CREATION DES CROYANTS ALIENES
		boolean tabCroyantAlienes1[]={false,true,true,false,true};
		CroyantAlienes CroyantAlienes1 = new CroyantAlienes("Croyant Aliénés1", tabCroyantAlienes1,"Empêche une Divinité possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.");
		tasDeCartes.add(CroyantAlienes1);
		
		boolean tabCroyantAlienes2[]={true,true,true,false,false};
		CroyantAlienes CroyantAlienes2 = new CroyantAlienes("Croyant Aliénés2", tabCroyantAlienes2,"Empêche une Divinité possédant le Dogme Mystique ou Chaos de sacrifier un de ses Guides Spirituels durant ce tour de jeu.");
		tasDeCartes.add(CroyantAlienes2);
		
		boolean tabCroyantAlienes3[]={false,true,false,true,true};
		CroyantAlienes CroyantAlienes3 = new CroyantAlienes("Croyant Aliénés3", tabCroyantAlienes3,"Vous piochez deux cartes au hasard dans la main d'une autre Divinité.");
		tasDeCartes.add(CroyantAlienes3);
		
		//CREATION DU CROYANT REVENANT
		boolean tabCroyantRevenant1[]={true,true,false,true,false};
		CroyantRevenant CroyantRevenant1 = new CroyantRevenant("Croyant Revenant", tabCroyantRevenant1);
		tasDeCartes.add(CroyantRevenant1);
		
		//CREATION DU CROYANT REVOLUTIONNAIRES
		boolean tabCroyantRevolutionnaires1[]={false,true,true,false,true};
		CroyantRevolutionnaires CroyantRevolutionnaires1 = new CroyantRevolutionnaires("Croyant Revolutionnaires", tabCroyantRevolutionnaires1);
		tasDeCartes.add(CroyantRevolutionnaires1);
		
		//CREATION DU CROYANT NIHILISTES
		boolean tabCroyantNihislites1[]={false,false,true,true,true};
		CroyantNihilistes CroyantNihislites1 = new CroyantNihilistes("Croyant Revolutionnaires", tabCroyantNihislites1);
		tasDeCartes.add(CroyantNihislites1);
		
		
		//CREATION DES DEUS EX ET AJOUT DANS LA PIOCHE
		DeuxEx DeuxExColereDivine1 = new DeuxEx("DeuxEx Colère Divine1","Détruit une carte Guide Spirituel d'Origine Nuit ou Néant, dont la capacité spéciale n'a pas effet. Les Croyants attachés reviennent au centre de la table.","Jour");
		tasDeCartes.add(DeuxExColereDivine1);
		
		DeuxEx DeuxExColereDivine2 = new DeuxEx("DeuxEx Colère Divine2","Détruit une carte Guide Spirituel d'Origine Nuit ou Néant, dont la capacité spéciale n'a pas effet. Les Croyants attachés reviennent au centre de la table.","Nuit");
		tasDeCartes.add(DeuxExColereDivine2);
		
		//CREATION DES APOCALYPSES
		Apocalypse Apocalypse1 = new Apocalypse("Apocalypse 1","Jour");
		tasDeCartes.add(Apocalypse1);
		
		Apocalypse Apocalypse2 = new Apocalypse("Apocalypse 2","Nuit");
		tasDeCartes.add(Apocalypse2);
		
		Apocalypse Apocalypse3 = new Apocalypse("Apocalypse 3","Néant");
		tasDeCartes.add(Apocalypse3);
		
		Apocalypse Apocalypse4 = new Apocalypse("Apocalypse 4",null);
		tasDeCartes.add(Apocalypse4);
		
		Apocalypse Apocalypse5 = new Apocalypse("Apocalypse 5",null);
		tasDeCartes.add(Apocalypse5);
	
		
		
	}
	
	
	public void melanger()
	{
		for(int i=0;i<tasDeCartes.size();i++)
		{
			int position = (int) Math.round((tasDeCartes.size()-1)*Math.random());
			Carte carte = tasDeCartes.pop();
			//System.out.println(carte);
			tasDeCartes.add(position,carte);
		}
	}
	
	public  Carte tirerCarteDuDessus()
	{
		
		return tasDeCartes.pop();
	}
	
	
	public  void defausser(Carte carte)
	{
		
		tasDeCartes.addLast(carte);
	}
	
	public void voirPioche()
	{
		
		for(Iterator it = tasDeCartes.iterator();it.hasNext(); )
		{
			
			Carte carte = (Carte) it.next();
			System.out.println(carte.getNom());
		}
		
	}
	
	
	
}