package combat;

import personnage.Personnage;


public class AffichageEcran 
{

    // -------------------------------------------------------------------------
    public  void afficherSeparateurDeTour() 
    {
        // DO : Afficher un retour � la ligne, suivi d'une ligne d'ast�risques, tel que montr� dans l'�nonc�
    	System.out.println("\n***************************************");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() 
    {
        // DO : Afficher un retour � la ligne, suivi du s�parateur "infos personnages", tel que montr� dans l'�nonc�
    	System.out.println("\n-----------------\n INFOS PERSONNAGES\n ----------------- ");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2) 
    {
        // TODO : Afficher le gagnant du combat, tel que montr� dans l'�nonc�
    }
    public void debutCombat()
    {
    	System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n>>>>> Que le combat commence ! <<<<<\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n\n");
    }
    
}