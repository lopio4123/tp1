package personnage;

public class Personnage {

    // -------------------------------------------------------------------------
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC param�tres
    }

    // -------------------------------------------------------------------------
    public Personnage() {
        // TODO : Constructeur SANS param�tres qui initialise � Z�RO ou � ""
    }

    // -------------------------------------------------------------------------
    // TODO : Les getters

    // -------------------------------------------------------------------------
    // TODO : Les setters

    // -------------------------------------------------------------------------
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montr� dans l'�nonc�
    }

    // -------------------------------------------------------------------------
    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouv�e al�atoirement et doit se situer entre Z�RO et valeurMaxAttaque.
        return 0;
    }

    // -------------------------------------------------------------------------
    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        //modifier les points de vie du personnage cible, afficher les d�tails
        // sur l'attaque, tel que montr� dans l'�nonc�.
    }

    // -------------------------------------------------------------------------
    public void setNewIniRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage.
    }
}
