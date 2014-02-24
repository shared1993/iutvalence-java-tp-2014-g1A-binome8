package bataillenavale;

public class Joueur {
	private Grille maGrille;
	private Grille saGrille;
	/* TODO A retenir ? */
	private Bateaux[] mesBateaux;
	private Case[] coupsJoues;
	
	public Joueur() {
		maGrille = new Grille();
		saGrille = new Grille();
		
	}
}
