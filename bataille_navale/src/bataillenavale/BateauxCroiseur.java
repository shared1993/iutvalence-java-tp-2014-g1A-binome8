package bataillenavale;

public class BateauxCroiseur extends Bateaux {
	private int Taille = 4;
	Grille MaGrilledeBateauxPlac�s;
/* cr�ation du bateau, check pour savori si ces coordon�es ne sortent pas de la grille, 
 * et appel de la methode (AssignerBateaux) sur la classe Bateaux pour savoir si le bateau tel que d�fini occupe 
 * bien des cases avec l'EtatCase "VIDE"
 */
	public BateauxCroiseur(Joueur J, Case CaseOrigine, Direction direction) {
		MaGrilledeBateauxPlac�s = J.getMaGrilledeBateauxPlac�s();
		if ((CaseOrigine.getCoordonneeX() >= Grille.NBCOL) && (CaseOrigine.getCoordonneeY() <= Grille.NBLIG))
			if (MaGrilledeBateauxPlac�s.getGrille()[CaseOrigine.getCoordonneeX()][CaseOrigine.getCoordonneeY()] == EtatCase.VIDE)
				if (direction == Direction.EST)
					if ((Taille + CaseOrigine.getCoordonneeX() ) <= Grille.NBCOL) {
						int i;
						int j;
						boolean check = true;
						for (i=CaseOrigine.getCoordonneeX(); i < (Taille-1); i++) {
							if (MaGrilledeBateauxPlac�s.getGrille()[i][CaseOrigine.getCoordonneeY()] != EtatCase.VIDE)
								check=false;
							}
						if (check == true) {
							Bateaux.AssignerBateaux(J, CaseOrigine, direction, this.Taille);
							}
						}
		}
}
