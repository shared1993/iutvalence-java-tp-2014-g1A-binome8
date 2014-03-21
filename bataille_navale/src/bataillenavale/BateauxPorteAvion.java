package bataillenavale;

public class BateauxPorteAvion extends Bateaux {
	private int Taille = 5;
	Grille MaGrilledeBateauxPlac�s;
	
	public BateauxPorteAvion(Joueur J, Case CaseOrigine, Direction direction) {
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
