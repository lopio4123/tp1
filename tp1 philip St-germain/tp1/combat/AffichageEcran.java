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
    	//si le personnage 2 gagne
    	 if(personnage1.getStatut() == false)
         {
         	System.out.println("\n\n" + personnage2.getNom() + " Est le grand gagnant de ce combat !!! \n");
         }
         //si le personnage 1 gagne
    	 else if(personnage2.getStatut() == false)
         {
         	System.out.println("\n\n" + personnage1.getNom() + " Est le grand gagnant de ce combat !!! \n");
         }
    	
    }
    public void debutCombat()
    {
    	System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n>>>>> Que le combat commence ! <<<<<\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n\n");
    }
    
}