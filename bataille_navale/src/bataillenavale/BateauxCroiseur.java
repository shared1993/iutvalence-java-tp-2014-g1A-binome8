package bataillenavale;

public class BateauxCroiseur extends Bateaux {
	private int Taille = 4;
	Grille MaGrilledeBateauxPlacés;
/* création du bateau, check pour savori si ces coordonées ne sortent pas de la grille, 
 * et appel de la methode (AssignerBateaux) sur la classe Bateaux pour savoir si le bateau tel que défini occupe 
 * bien des cases avec l'EtatCase "VIDE"
 */
	public BateauxCroiseur(Joueur J, Case CaseOrigine, Direction direction) {
		MaGrilledeBateauxPlacés = J.getMaGrilledeBateauxPlacés();
		if ((CaseOrigine.getCoordonneeX() >= Grille.NBCOL) && (CaseOrigine.getCoordonneeY() <= Grille.NBLIG))
			if (MaGrilledeBateauxPlacés.getGrille()[CaseOrigine.getCoordonneeX()][CaseOrigine.getCoordonneeY()] == EtatCase.VIDE)
				if (direction == Direction.EST)
					if ((Taille + CaseOrigine.getCoordonneeX() ) <= Grille.NBCOL) {
						int i;
						int j;
						boolean check = true;
						for (i=CaseOrigine.getCoordonneeX(); i < (Taille-1); i++) {
							if (MaGrilledeBateauxPlacés.getGrille()[i][CaseOrigine.getCoordonneeY()] != EtatCase.VIDE)
								check=false;
							}
						if (check == true) {
							Bateaux.AssignerBateaux(J, CaseOrigine, direction, this.Taille);
							}
						}
		}
}
