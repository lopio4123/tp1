package main;

import personnage.Personnage;
import personnage.Retiaire;
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
        Retiaire personnage1 = new Retiaire("Bob le malchanceux",15,15,70,15,true); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur ",25,5,100,30,true); //L'initialisation du personnage doit se faire dans le constructeur
        
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        affichage.debutCombat();
        tour.compteurDeTour();
        //boucle qui continue tant que l'un des gladiateur n'est pas mort
        do
        {
        	personnage1.attaqueRetiaire(personnage2);
        	//personnage1.attaqueRetiaire(personnage2);
        	tour.afficheTour();
        	
        	//boucle d'initiative
        	 for(int ini = 0;ini <= 100;ini++)
        	 {
        		 //si le premier personnage attaque à premier
        		 if(ini == personnage1.getIni())
        		 {
        			 personnage1.frapperPersonnage(personnage2);
        			 //si le personnage 2 decede, il ne peux plus attaquer
        			 if (personnage2.getStatut()==false) break;
        			 personnage2.frapperPersonnage(personnage1);
        			 break;
        		 }
        		 //si le deuxieme personnage attaque en premier
        		 else if(ini == personnage2.getIni())
        		 {
        			 personnage2.frapperPersonnage(personnage1);
        			//si le personnage 1 decede, il ne peux plus attaquer
        			 if (personnage1.getStatut()==false) break;
        			 personnage1.frapperPersonnage(personnage2);
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
        //message de victoire
        affichage.afficheVictoire(personnage1, personnage2);
        
    }

}
