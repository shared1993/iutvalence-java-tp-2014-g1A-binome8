/* TODO JavaDoc. */
/* TODO Package avec un meilleur nom. */
package bataillenavale;

public class Grille {
	public static final int NBCOL = 9;
	public static final int NBLIG = 9;
	public EtatCase[][] Grille;
	
	public Grille() {
		this.Grille = new EtatCase[NBLIG][NBCOL];
		int i;
		int j;
		for (i=0; i<NBCOL; ++i)
			for (j=0; j<NBLIG; ++i)
				this.Grille[i][j] = EtatCase.VIDE;
				
	}
	
	public void placerBateaux(){
		int i;
		for (i=0; i<Bateaux.nbMaxCase; i++)
			maGrilledeBateauxPlacés[TabBateaux[i].cX][TabBateaux[i].cY] = new EtatCase.BATEAU_INTACT;
	}
	
	public void majmaGrilledeBateauxPlacés(Case caseJouée, int touché){
		if (touché == 0)
			Joueur.maGrilledeBateauxPlacés[caseJouée.cX][caseJouée.cY] = new EtatCase.BATEAU_INTACT;
		if (touché == 1)
			Joueur.maGrilledeBateauxPlacés[caseJouée.cX][caseJouée.cY] = new EtatCase.BATEAU_TOUCHE;
	}
	
	public void majmaGrilledeCoupsJoués(Case caseJouée, int touché){
		if (touché == 0)
			Joueur.maGrilledeBateauxPlacés[caseJouée.cX][caseJouée.cY] = new EtatCase.RATE;
		if (touché == 1)
			Joueur.maGrilledeBateauxPlacés[caseJouée.cX][caseJouée.cY] = new EtatCase.TOUCHE;
	}
}
