package bataillenavale;

public class Partie {
	public Joueur joueur1;
	public Joueur joueur2;
	public Joueur joueurCourant;
	
	public Partie() {
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		DemarerPartie(); /*boucler jusqu'a ce que checkPartieGagn�() soit vraie*/
		FinPartie();
	}
	
	public void DemarerPartie() {
		Joueur joueurCourant;
		while (checkPartieGagn�() == false){
			joueurCourant = this.joueur1;
			JouerCoup(x,y);
			checkPartieGagn�();
			joueurCourant = this.joueur2;
			joueurCoup(x,y);
			checkPartieGagn�();
		}
	
	public boolean checkPartieGagn�(){
		/*le joueur courant est le joueur 1*/
		if (this.joueurCourant == joueur1){
			int i;
			while (i<Bateaux.nbMaxCase & this.joueur2.Bateaux.TabBateaux[i] = (-1,-1))
				i++;
			if (i = Bateaux.nbMaxCase)
				return true;
			else
				return false;	
		}
		/*le joueur courant est le joueur 2*/
		if (this.joueurCourant == joueur2){
			int i;
			while (i<Bateaux.nbMaxCase & this.joueur1.Bateaux.TabBateaux[i] = (-1,-1))
				i++;
			if (i = Bateaux.nbMaxCase)
				return true;
			else
				return false;	
		}
	}
	
	public void FinPartie(){
		/*on detruit tout les objets*/
		/* 'JoueurCourant' a gagn�!*/
	}
			
}
		
