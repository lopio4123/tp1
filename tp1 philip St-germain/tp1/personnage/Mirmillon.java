package personnage;

import personnage.Personnage;
import java.util.Random;

public class Mirmillon extends Personnage {

	// constructeur
	public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini, boolean statut) {
		super(nom, attaqueMax, defense, pvs, ini, statut);
	}

	public void setNewIniRandomMirmillon() {
		// DO : Modifier de façon aléatoire la valeur INI du personnage.
		Random rand = new Random();
		int minValue = 0;
		int maxValue = 30;
		setIni(rand.nextInt(maxValue - minValue) + minValue);
	}

	// double attaque
	public void attaqueMirmillon(Personnage personnageCible) {
		frapperPersonnage(personnageCible);

		// si le personnage cible meurt de la premiere attaque
		if (personnageCible.getPvs() == 0) {
			System.out.println("\n" + getNom() + " Decapite joyeusement le pauvre " + personnageCible.getNom()
					+ " qui tante vainement de séchaper.\n");
		}

		// si il survit, il attaque a nouveau
		else {
			System.out.println("\n" + getNom() + " attaque de nouveau\n");
			frapperPersonnage(personnageCible);
		}
	}
}
