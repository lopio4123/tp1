
package combat;

public class CompteurDeTour 
{
	int  numeroDeTour=0;

    // -------------------------------------------------------------------------
    public void compteurDeTour() 
    {
        // DO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
    	setNumeroDeTour(1);
    }

    // -------------------------------------------------------------------------
    // DO : Le getter
    public int getNumeroDeTour() 
    {
		return numeroDeTour;
	}
    // -------------------------------------------------------------------------
    // DO : Le setter
    public void setNumeroDeTour(int numeroDeTour) 
    {
		this.numeroDeTour = numeroDeTour;
	}
    // -------------------------------------------------------------------------
    public void augmenteTour() 
    {
        // DO : Incrémenter le compteur de tour
    	setNumeroDeTour(numeroDeTour + 1);
    }

	// -------------------------------------------------------------------------
    public void afficheTour() 
    {
        // DO : Afficher le tour actuel, tel que montré dans l'énoncé
    	System.out.println("\n---------------\n TOUR ACTUEL: " + numeroDeTour + "\n ---------------" );
    	
    }
}
