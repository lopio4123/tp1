package personnage;
import java.util.Random;

public class Personnage 
{
	String nom;
	int attaqueMax;
	int defense;
	int pvs;
	int ini;
	boolean statut;
	
	
    // -------------------------------------------------------------------------
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini, boolean statut) 
    {
        //DO : Constructeur AVEC param�tres
    	this.nom = nom;
    	this.attaqueMax = attaqueMax;
    	this.defense = defense;
    	this.pvs = pvs;
    	this.ini = ini;
    	this.statut = statut;
    }

    // -------------------------------------------------------------------------
    public Personnage() 
    {
        // DO : Constructeur SANS param�tres qui initialise � Z�RO ou � ""
    	nom = "";
    	attaqueMax = 0;
    	defense = 0;
    	pvs = 0;
    	ini = 0;
    	statut = false;
    }

    // -------------------------------------------------------------------------
    
    // DO : Les getters
    public boolean getStatut()
    {
    	return statut;
    }
    public String getNom() 
    {
		return nom;
	}
    public int getAttaqueMax() 
	{
		return attaqueMax;
	}
    public int getDefense() 
	{
		return defense;
	}
    public int getPvs() 
	{
		return pvs;
	}
    public int getIni() 
	{
		return ini;
	}
    
    
    
    // -------------------------------------------------------------------------
    // DO : Les setters
    public void setStatut(boolean statut)
    {
    	this.statut = statut;
    }
    public void setNom(String nom) 
	{
		this.nom = nom;
	}
    public void setAttaqueMax(int attaqueMax) 
	{
		this.attaqueMax = attaqueMax;
	}
    public void setDefense(int defense) 
	{
		this.defense = defense;
	}
    public void setPvs(int pvs) 
	{
		this.pvs = pvs;
	}
    public void setIni(int ini) 
	{
		this.ini = ini;
	}
    
    
    
    // -------------------------------------------------------------------------
    public void afficherInfosPersonnage() 
    {
        // DO : Afficher les infos du personnage, tel que montr� dans l'�nonc�
    	System.out.print("\n\n" + getNom() + "\n	Attaque : " + getAttaqueMax() +
    	"\n	defense : " + getDefense() + 
    	"\n	points de vies : " + getPvs() +
    	"\n	Initiative : " + getIni() +
    	"\n 	statut : ");
    	//si le joueur est vivant ou mort
    	if (getStatut() == true) System.out.print(" vivant");
    	else System.out.print("mort");
    }
    
	// -------------------------------------------------------------------------
    private int attaqueCalcul()
    {
        // DO : Retourner la valeur de l'attaque du personnage.
    	
    	Random rand = new Random();
		int minValue = 0;
		int maxValue = attaqueMax;
		return rand.nextInt(maxValue - minValue) + minValue;
        // Cette valeur est trouv�e al�atoirement et doit se situer entre Z�RO et valeurMaxAttaque.
    }

    // -------------------------------------------------------------------------
    public static void frapperPersonnage(Personnage personnageCible, Personnage personnageAttaquant) 
    {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
    	int puissance =personnageAttaquant.attaqueCalcul();
    	int degat = puissance - personnageCible.defense;
    	//si les degats sont dans le negatif
    	if (degat < 0) degat = 0;
    	personnageCible.pvs -= degat;
    	if(personnageCible.pvs < 0) personnageCible.pvs = 0;
    	//si le personnage meurt
    	if (personnageCible.pvs <= 0) personnageCible.statut = false;
        //modifier les points de vie du personnage cible, afficher les d�tails
    	System.out.println("\n" + personnageAttaquant.getNom() + " attaque avec une puissance de : " + puissance);
    	System.out.println("\n" + personnageCible.getNom() + " a une d�fense de : " + personnageCible.getDefense());
    	System.out.println("\n les degats subis sont de : " + degat);
    	
        // sur l'attaque, tel que montr� dans l'�nonc�.
    }

    // -------------------------------------------------------------------------
    public void setNewIniRandom() 
    {
        // DO : Modifier de fa�on al�atoire la valeur INI du personnage.
    	Random rand = new Random();
		int minValue = 0;
		int maxValue = 100;
		ini = rand.nextInt(maxValue - minValue) + minValue;		
    }
}
