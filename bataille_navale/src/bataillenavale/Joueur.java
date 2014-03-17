package bataillenavale;

public class Joueur {
	private Grille maGrilledeBateauxPlacés;
	private Grille maGrilledeCoupsJoues;
	/* TODO A retenir ? */
	private Bateaux[] mesBateaux;
	private Case[] coupsJoues;
	
	public Joueur() {
		maGrilledeBateauxPlacés = new Grille();
		maGrilledeCoupsJoues = new Grille();
		
	}
}
