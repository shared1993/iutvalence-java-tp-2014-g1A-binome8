
package bataillenavale;

public class Grille {
	public static final int NBCOL = 10;
	public static final int NBLIG = 10;
	public static int getNbcol() {
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
		this.grille = grille;
	}
	

	public Grille() {
		grille = new EtatCase[NBLIG][NBCOL];
		int i;
		int j;
		for (i=0; i<NBCOL; ++i)
			for (j=0; j<NBLIG; ++i)
				this.getGrille()[i][j] = EtatCase.VIDE;
				
	}
	Case[] MesBateaux;
	Grille MaGrilledeBateauxPlacés; 
	
	/*On met a jour MaGrilledeBateauxPlacés en assignant les EtatCases "OCCUPE" 
	 * aux cases correspondant a celle que l'on vient juste de definir dans
	 * le tableau mesBateaux pour le bateau en cour, on a noté les indices du tableau 
	 * de bateau MesBateaux: l'indice de la coordonée d'origine du bateaux en cours "debut"
	 * et l'indice de sa coordonée de fin "fin" afin de parcourir l'integralité des cases 
	 * du bateau en cours*/
	public void MajGrilleBateauxPlacés (Joueur J, int debut, int fin) {
		MesBateaux = J.getMesBateaux();
		MaGrilledeBateauxPlacés = J.getMaGrilledeBateauxPlacés();
		int i;
		for (i=debut; i<fin; i++){
			MaGrilledeBateauxPlacés.getGrille()[MesBateaux[i].getCoordonneeX()][MesBateaux[i].getCoordonneeY()] = EtatCase.OCCUPE;
			}
		}
	
}
