package bataillenavale;

public class Joueur {
	private Grille maGrilledeBateauxPlac�s;
	public Grille getMaGrilledeBateauxPlac�s() {
		return maGrilledeBateauxPlac�s;
	}
	public void setMaGrilledeBateauxPlac�s(Grille maGrilledeBateauxPlac�s) {
		this.maGrilledeBateauxPlac�s = maGrilledeBateauxPlac�s;
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
		maGrilledeBateauxPlac�s = new Grille();
		maGrilledeCoupsJoues = new Grille();
		mesBateaux = new Bateaux();
		coupsJoues = new CoupsJou�s();
		}

	
}
