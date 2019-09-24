package personnage;

import java.util.Random; //pour les randoms

public class Retiaire extends Personnage {

	boolean filetEnMain = true;

	// constructeur
	public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini, boolean statut) {
		super(nom, attaqueMax, defense, pvs, ini, statut);
	}

	// calcule du 10% de chances
	private boolean calculeReussiteLance() {
		int valeurRandom = 0;
		Random rand = new Random();
		int minValue = 0;
		int maxValue = 100;
		valeurRandom = rand.nextInt(maxValue - minValue) + minValue;
		// 10% de chance de reussite
		// si cela reussit
		if (valeurRandom <= 10) {
			return true;
		}
		// si cela ne reussit pas
		else {
			return false;
		}
	}

	public void attaqueRetiaire(Personnage personnageCible) {
		boolean reussite = calculeReussiteLance();
		// si le lance a marché
		if (reussite == true) {
			System.out.println("\n" + getNom() + " \nlance son filet. \nLe filet attrape " + personnageCible.getNom()
					+ " et l'empale sauvagement avec sa lance.\n");
			personnageCible.setPvs(0);
			personnageCible.setStatut(false);
		}
		// si le lance n'a pas marché
		else {
			System.out.println(getNom() + " \nlance son filet , mais malheureusement, le filet a rate sa cible...\n");
			setFiletEnMain(false);
		}
	}

	// getters
	public boolean getFiletEnMain() {
		return filetEnMain;
	}

	// setters
	public void setFiletEnMain(boolean filetEnMain) {
		this.filetEnMain = filetEnMain;
	}

	// fonction qui permet de ramasser le filet

	public void ramassageFilet() {
		System.out.println(getNom() + "\nramasse son filet et en profite pour attaquer.\n");
		setFiletEnMain(true);
	}

}
