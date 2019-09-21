package combat;

import personnage.Personnage;


public class AffichageEcran 
{

    // -------------------------------------------------------------------------
    public  void afficherSeparateurDeTour() 
    {
        // DO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
    	System.out.println("\n***************************************");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() 
    {
        // DO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
    	System.out.println("\n-----------------\n INFOS PERSONNAGES\n ----------------- ");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2) 
    {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
    }
    public void debutCombat()
    {
    	System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n>>>>> Que le combat commence ! <<<<<\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n\n");
    }
    
}