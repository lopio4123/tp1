package main;

import personnage.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        //initialisation de bob le malchanceux
        Personnage personnage1 = new Personnage("Bob le malchanceux",15,15,70,15,true); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur ",25,5,100,30,true); //L'initialisation du personnage doit se faire dans le constructeur
        
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        affichage.debutCombat();
        tour.CompteurDeTour();
        //boucle qui continue tant que l'un des gladiateur n'est pas mort
        do
        {
        	tour.afficheTour();
        	
        	//boucle d'initiative
        	 for(int ini = 0;ini <= 100;ini++)
        	 {
        		 //si le premier personnage attaque à premier
        		 if(ini == personnage1.getIni())
        		 {
        			 Personnage.frapperPersonnage(personnage2,personnage1);
        			 //si le personnage 2 decede, il ne peux plus attaquer
        			 if (personnage2.getStatut()==false) break;
        			 Personnage.frapperPersonnage(personnage1,personnage2);
        			 break;
        		 }
        		 //si le deuxieme personnage attaque en premier
        		 else if(ini == personnage2.getIni())
        		 {
        			 Personnage.frapperPersonnage(personnage1,personnage2);
        			//si le personnage 1 decede, il ne peux plus attaquer
        			 if (personnage1.getStatut()==false) break;
        			 Personnage.frapperPersonnage(personnage2,personnage1);
        			 break;
        		 }
        	 }
        	 personnage1.setNewIniRandom();
        	 personnage2.setNewIniRandom();
        	 affichage.afficherSeparateurInfosPerso();
        	 personnage1.afficherInfosPersonnage();
        	 personnage2.afficherInfosPersonnage();
        	 affichage.afficherSeparateurDeTour();
        	 tour.augmenteTour();
        }while(personnage1.getStatut() == true && personnage2.getStatut() == true);
        
    }

}
