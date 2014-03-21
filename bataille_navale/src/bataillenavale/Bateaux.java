package bataillenavale;

public abstract class Bateaux {
	private int TailleTabBateau = 21;
	public static enum Direction {
		EST,
		OUEST,
		NORD,
		SUD
	}
	
	Case[] MesBateaux;
	
	/* l'appel du constructeur de la class abstraite Bateaux créé les sous classes de Bateaux 
	 * (BateauxPorteAvion etc), et initialise les Cases vides du tableau de bateaux MesBateaux a 
	 * la valeur (-1,-1)
	 */
	public abstract void Bateaux() {
		MesBateaux = new Case[TailleTabBateaux];
		PorteAvion = new BateauxPorteAvion();
		Croiseur = new BateauxCroiseur();
		SousMarin = new BateauxSousMarin();
		Vedette1 = new BateauxVedette1();
		Vedette2 =  new BateauxVedette2();
		int i;
		for (i=0; i<TailleTabBateau;i++) {
			MesBateaux[i] = new Case(-1,-1);
		}
	}
	
	/* on enregistre les coordonées de chaques cases du bateau dans le tableau "MesBateaux"
	 * puis on met a jour meGrilledeBateauxPlacés en appelant la methode MajGrilleBateauxPlacés 
	 * de la classe Grille*/
	public void AssignerBateaux(Joueur J, Case CaseOrigine, Direction direction, int Taille) {
		MesBateaux = J.getMesBateaux();
		int i = 0;
		while (MesBateaux[i] != new Case(-1,-1)) {
			i++;
			}
		int DebutMajGrille = i;
		MesBateaux[i] = CaseOrigine;
		i++;
		int j;
		while (j < (Taille-1)) {
			if (direction == Direction.EST) {
				MesBateaux[i] = new Case(CaseOrigine.getCoordonneeX() +1 , CaseOrigine.getCoordonneeY());
				i++;
				}
			if (direction == Direction.OUEST) {
				MesBateaux[i] = new Case(CaseOrigine.getCoordonneeX() -1 , CaseOrigine.getCoordonneeY());
				i++;
			}
			if (direction == Direction.NORD) {
				MesBateaux[i] = new Case(CaseOrigine.getCoordonneeX() , CaseOrigine.getCoordonneeY() +1);
				i++;
			}
			if (direction == Direction.SUD) {
				MesBateaux[i] = new Case(CaseOrigine.getCoordonneeX() , CaseOrigine.getCoordonneeY() -1);
				i++;
			}
			j--;
		}
		int FinMajGrille = i;
		Grille.MajGrilleBateauxPlacés(J, DebutMajGrille , FinMajGrille);
	}

	
	
	 
	
	
}
