package bataillenavale;

public class BateauxPorteAvion extends Bateaux {
	private int Taille = 5;
	private Case CaseOrigine;
	private Direction directionBateau;
	
	public void BateauxPorteAvion(int x, int y, int taille, Direction direction){
		this.CaseOrigine = new Case(x,y);
		this.Taille = taille;
		this.directionBateau = direction;
		CreerPorteAvion(CaseOrigine, Taille, directionBateau);
		placerBateaux();
	}
	
	public void CreerPorteAvion (Case origine, int taille, Direction direction){
		if (checkPositionValide(origine, taille, direction) == True)
			AssignerBateaux(origine, taille, direction);
		else
			/*recreer bateau*/
				
	}
	public void AssignerBateaux(Case origine, int taille, Direction direction) {
		int i = 0;
		while (Bateaux.TabBateaux[i] != new Case(-1,-1)) {
			i++;
			}
		Bateaux.TabBateaux[i] = origine;
		i++;
		int j = 0;
		while (j < (taille-1)) {
			if (direction == Direction.EST) {
				Bateaux.TabBateaux[i] = new Case(origine.cX +1 , origine.cY);
				i++;
				}
			if (direction == Direction.OUEST) {
				Bateaux.TabBateaux[i] = new Case(origine.cX -1 , origine.cY);
				i++;
			}
			if (direction == Direction.NORD) {
				Bateaux.TabBateaux[i] = new Case(origine.cX) , origine.cY +1);
				i++;
			}
			if (direction == Direction.SUD) {
				Bateaux.TabBateaux[i] = new Case(origine.cX , origine.cY -1);
				i++;
			}
			j++;
		}
	}

	
	/*public void BateauxPorteAvion(Joueur J, Case CaseOrigine, Direction direction) {
		MaGrilledeBateauxPlacés = J.getMaGrilledeBateauxPlacés();
		if ((CaseOrigine.getCoordonneeX() >= Grille.NBCOL) && (CaseOrigine.getCoordonneeY() <= Grille.NBLIG))
			if (MaGrilledeBateauxPlacés.getGrille()[CaseOrigine.getCoordonneeX()][CaseOrigine.getCoordonneeY()] == EtatCase.VIDE)
				if (direction == Direction.EST)
					if ((Taille + CaseOrigine.getCoordonneeX() ) <= Grille.NBCOL) {
						int i;
						boolean check = true;
						for (i=CaseOrigine.getCoordonneeX(); i < (Taille-1); i++) {
							if (MaGrilledeBateauxPlacés.getGrille()[i][CaseOrigine.getCoordonneeY()] != EtatCase.VIDE)
								check=false;
								}
						if (check == true) {
							Bateaux.AssignerBateaux(J, CaseOrigine, direction, this.Taille);
						}
					}*/

}
