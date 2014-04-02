package bataillenavale;

public class Joueur {
	public Grille maGrilledeBateauxPlacés;
	public Grille maGrilledeCoupsJoués;
	public Bateaux mesBateaux;
	
	public Joueur() {
		this.maGrilledeBateauxPlacés = new Grille();
		this.maGrilledeCoupsJoués = new Grille();
		this.mesBateaux = new Bateaux();
		}

	public void JouerCoup(Case caseJouée){
		/*le joueur courant est le joueur 1*/
		if (Partie.joueurCourant == joueur1){
			if (Bateaux.checkBateauxTouché(casejouée) == true ){
				if (Partie.checkPartieGagné() == true){
					Partie.finPartie();
				}
				else{
					Partie.joueur2.Grille.majmaGrilledeBateauxPlacés(caseJouée, 1);
					Partie.joueur2.Bateaux.majTabBateaux(casejouée);
					Partie.joueur1.Grille.majmaGrilledeCoupsJoués(caseJouée, 1);
				}		
			}
			if (Bateaux.checkBateauxTouché(casejouée) == false ){
				Partie.joueur1.Grille.majmaGrilledeCoupsJoués(caseJouée, 0);
				Partie.joueur2.Grille.majmaGrilledeBateauxPlacés(caseJouée, 0);
			}
				
		}
		/*le joueur courant est le joueur 2*/
		if (Partie.joueurCourant == joueur2){
			if (Bateaux.checkBateauxTouché(casejouée, 1) == true ){
				if (Partie.checkPartieGagné() == true){
					Partie.finPartie();
				}
				else{
					Partie.joueur1.Grille.majmaGrilledeBateauxPlacés(caseJouée, 1);
					Partie.joueur1.Bateaux.majTabBateaux(casejouée);
					Partie.joueur2.Grille.majmaGrilledeCoupsJoués(caseJouée, 1);
				}		
			}
			if (Bateaux.checkBateauxTouché(casejouée, 0) == false ){
				Partie.joueur2.majmaGrilledeCoupsJoués(caseJouée, 0);
				Partie.joueur1.majmaGrilledeBateauxPlacés(caseJouée, 0);
			}
				
		}
	}
}
