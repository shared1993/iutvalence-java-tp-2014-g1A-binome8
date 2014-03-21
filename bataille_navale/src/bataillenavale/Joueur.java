package bataillenavale;

public class Joueur {
	private Grille maGrilledeBateauxPlacés;
	public Grille getMaGrilledeBateauxPlacés() {
		return maGrilledeBateauxPlacés;
	}
	public void setMaGrilledeBateauxPlacés(Grille maGrilledeBateauxPlacés) {
		this.maGrilledeBateauxPlacés = maGrilledeBateauxPlacés;
	}

	private Grille maGrilledeCoupsJoues;
	
	private Case[] mesBateaux;
	public Case[] getMesBateaux() {
		return mesBateaux;
	}
	public void setMesBateaux(Case[] mesBateaux) {
		this.mesBateaux = mesBateaux;
	}

	private Case[] coupsJoues;
	
	public Joueur() {
		maGrilledeBateauxPlacés = new Grille();
		maGrilledeCoupsJoues = new Grille();
		mesBateaux = new Bateaux();
		coupsJoues = new CoupsJoués();
		}

	
}
