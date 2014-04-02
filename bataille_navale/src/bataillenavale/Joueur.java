package bataillenavale;

public class Joueur {
	private Grille maGrilledeBateauxPlacés;
	private Grille maGrilledeCoupsJoués;
	private Bateaux mesBateaux;
	
	public Joueur() {
		this.maGrilledeBateauxPlacés = new Grille();
		this.maGrilledeCoupsJoués = new Grille();
		this.mesBateaux = new Bateaux();
		
		}

	
}
