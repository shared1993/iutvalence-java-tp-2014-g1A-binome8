/* TODO JavaDoc. */
/* TODO Package avec un meilleur nom. */
package bataillenavale;

public class Grille {
	public static final int NBCOL = 10;
	public static final int NBLIG = 10;
	public EtatCase[][] Grille;
	
	/*public static int getNbcol() {
		return NBCOL;
	}
	public static int getNblig() {
		return NBLIG;
	}

	private EtatCase[][] grille;
	public EtatCase[][] getGrille() {
		return grille;
	}
	public void setGrille(EtatCase[][] grille) {
		this.grille = grille;*/

	

	public Grille() {
		this.Grille = new EtatCase[NBLIG][NBCOL];
		int i;
		int j;
		for (i=0; i<NBCOL; ++i)
			for (j=0; j<NBLIG; ++i)
				this.Grille[i][j] = EtatCase.VIDE;
				
	}
	
	
	/*On met a jour MaGrilledeBateauxPlac�s en assignant les EtatCases "OCCUPE" 
	 * aux cases correspondant a celle que l'on vient juste de definir dans
	 * le tableau mesBateaux pour le bateau en cour, on a not� les indices du tableau 
	 * de bateau MesBateaux: l'indice de la coordon�e d'origine du bateaux en cours "debut"
	 * et l'indice de sa coordon�e de fin "fin" afin de parcourir l'integralit� des cases 
	 * du bateau en cours*/
	
	public void placerBateaux(){
		int i;
		for (i=0; i<Bateaux.nbMaxCase; i++)
			Joueur.maGrilledeBateauxPlac�s[i] = new EtatCase.BATEAU_INTACT
	}
	
	/*public static void MajGrilleBateauxPlac�s (Joueur J, int debut, int fin) {
		Case[] MesBateaux;
		Grille MaGrilledeBateauxPlac�s; 
		MesBateaux = J.getMesBateaux();
		MaGrilledeBateauxPlac�s = J.getMaGrilledeBateauxPlac�s();
		int i;
		for (i=debut; i<fin; i++){
			MaGrilledeBateauxPlac�s.getGrille()[MesBateaux[i].getCoordonneeX()][MesBateaux[i].getCoordonneeY()] = EtatCase.OCCUPE;
			}
		}*/
	
}
