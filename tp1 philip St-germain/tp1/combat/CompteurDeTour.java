
package combat;

public class CompteurDeTour 
{
	int  numeroDeTour=0;

    // -------------------------------------------------------------------------
    public void CompteurDeTour() 
    {
        // DO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
    	numeroDeTour = 1;
    }

    // -------------------------------------------------------------------------
    // TODO : Le getter
    public int getNumeroDeTour() 
    {
		return numeroDeTour;
	}
    // -------------------------------------------------------------------------
    // TODO : Le setter
    public void setNumeroDeTour(int numeroDeTour) 
    {
		this.numeroDeTour = numeroDeTour;
	}
    // -------------------------------------------------------------------------
    public void augmenteTour() 
    {
        // DO : Incrémenter le compteur de tour
    	numeroDeTour++;
    }

	// -------------------------------------------------------------------------
    public void afficheTour() 
    {
        // DO : Afficher le tour actuel, tel que montré dans l'énoncé
    	System.out.println("\n---------------\n TOUR ACTUEL: " + numeroDeTour + "\n ---------------" );
    	
    }
}
