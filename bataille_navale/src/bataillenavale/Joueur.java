package bataillenavale;

public class Joueur {
	public Grille maGrilledeBateauxPlac�s;
	public Grille maGrilledeCoupsJou�s;
	public Bateaux mesBateaux;
	
	public Joueur() {
		this.maGrilledeBateauxPlac�s = new Grille();
		this.maGrilledeCoupsJou�s = new Grille();
		this.mesBateaux = new Bateaux();
		}

	public void JouerCoup(Case caseJou�e){
		/*le joueur courant est le joueur 1*/
		if (Partie.joueurCourant == joueur1){
			if (Bateaux.checkBateauxTouch�(casejou�e) == true ){
				if (Partie.checkPartieGagn�() == true){
					Partie.finPartie();
				}
				else{
					Partie.joueur2.Grille.majmaGrilledeBateauxPlac�s(caseJou�e, 1);
					Partie.joueur2.Bateaux.majTabBateaux(casejou�e);
					Partie.joueur1.Grille.majmaGrilledeCoupsJou�s(caseJou�e, 1);
				}		
			}
			if (Bateaux.checkBateauxTouch�(casejou�e) == false ){
				Partie.joueur1.Grille.majmaGrilledeCoupsJou�s(caseJou�e, 0);
				Partie.joueur2.Grille.majmaGrilledeBateauxPlac�s(caseJou�e, 0);
			}
				
		}
		/*le joueur courant est le joueur 2*/
		if (Partie.joueurCourant == joueur2){
			if (Bateaux.checkBateauxTouch�(casejou�e, 1) == true ){
				if (Partie.checkPartieGagn�() == true){
					Partie.finPartie();
				}
				else{
					Partie.joueur1.Grille.majmaGrilledeBateauxPlac�s(caseJou�e, 1);
					Partie.joueur1.Bateaux.majTabBateaux(casejou�e);
					Partie.joueur2.Grille.majmaGrilledeCoupsJou�s(caseJou�e, 1);
				}		
			}
			if (Bateaux.checkBateauxTouch�(casejou�e, 0) == false ){
				Partie.joueur2.majmaGrilledeCoupsJou�s(caseJou�e, 0);
				Partie.joueur1.majmaGrilledeBateauxPlac�s(caseJou�e, 0);
			}
				
		}
	}
}
