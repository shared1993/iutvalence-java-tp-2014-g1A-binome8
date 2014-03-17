package bataillenavale;

public class Grille {
	private enum EtatCase {
		VIDE,
		OCCUPE,
		RATE,
		BATEAU_TOUCHE,
		BATEAU_INTACT
	}
	
	private EtatCase[][] grille;

	public Grille() 	{
		grille = new EtatCase[10][10];
	}
}
