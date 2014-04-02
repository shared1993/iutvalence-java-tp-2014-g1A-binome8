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
			maGrilledeBateauxPlac�s[TabBateaux[i].cX][TabBateaux[i].cY] = new EtatCase.BATEAU_INTACT;
	}
	
	public void majmaGrilledeBateauxPlac�s(Case caseJou�e, int touch�){
		if (touch� == 0)
			Joueur.maGrilledeBateauxPlac�s[caseJou�e.cX][caseJou�e.cY] = new EtatCase.BATEAU_INTACT;
		if (touch� == 1)
			Joueur.maGrilledeBateauxPlac�s[caseJou�e.cX][caseJou�e.cY] = new EtatCase.BATEAU_TOUCHE;
	}
	
	public void majmaGrilledeCoupsJou�s(Case caseJou�e, int touch�){
		if (touch� == 0)
			Joueur.maGrilledeBateauxPlac�s[caseJou�e.cX][caseJou�e.cY] = new EtatCase.RATE;
		if (touch� == 1)
			Joueur.maGrilledeBateauxPlac�s[caseJou�e.cX][caseJou�e.cY] = new EtatCase.TOUCHE;
	}
}
