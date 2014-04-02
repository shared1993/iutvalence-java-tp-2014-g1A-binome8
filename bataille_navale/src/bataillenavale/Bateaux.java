/* TODO JavaDoc. */
/* TODO Package avec un meilleur nom. */
package bataillenavale;

public abstract class Bateaux {
	public static int nbMaxCase = 21;
	public Case[] TabBateaux;
	private BateauxPorteAvion PorteAvion;
	private BateauxCroiseur Croiseur;
	private BateauxSousMarin SousMarin; 
	private BateauxVedette1 Vedette1;
	private BateauxVedette2 Vedette2;
	
	public void Bateaux(){
		this.TabBateaux = new Case[nbMaxCase];
		initTabBateaux();
		this.Croiseur = new BateauxCroiseur(get caseorigine, get taille, get direction);
		this.SousMarin = new BateauxSousMarin(get caseorigine, get taille, get direction);
		this.PorteAvion = new BateauxPorteAvion(get caseorigine, get taille, get direction);
		this.Vedette1 = new BateauxVedette1(get caseorigine, get taille, get direction);
		this.Vedette2 = new BateauxVedette2(get caseorigine, get taille, get direction);
		
	}
	
	public void initTabBateaux() {
		int i;
		for (i=0; i<nbMaxCase; i++) 
		{
			this.TabBateaux[i] = new Case(-1,-1);
		}
	}
	
	public boolean checkPositionValide(Case caseorigine, int taille, Direction direction){
		if (caseorigine.cX >=0 & caseorigine.cX <= 10){
			if (caseorigine.cY >= 0 & caseorigine.cY <= 10){
				/*test direction OUEST*/
				if (direction == Direction.NORD){
					if (caseorigine.cY - taille >= 0 & caseorigine.cY - taille <=10){
						int i;
						for (i=0; i<taille; i++){
							if (maGrilledeBateauxPlacés[caseorigine.cX][caseorigine.cY - i] == EtatCase.VIDE){
								return true;										
							}
							else
								return false;
						}
					}
					else
						return false;
				}
				/*test direction OUEST*/
				if (direction == Direction.OUEST){
					if (caseorigine.cX - taille >= 0 & caseorigine.cX - taille <=10){
						int i;
						for (i=0; i<taille; i++){
							if (maGrilledeBateauxPlacés[caseorigine.cX - i][caseorigine.cY] == EtatCase.VIDE){
								return true;										
							}
							else
								return false;
						}
					}
					else
						return false;
				}
				/*test direction SUD*/
				if (direction == Direction.SUD){
					if (caseorigine.cY + taille >= 0 & caseorigine.cY + taille <=10){
						int i;
						for (i=0; i<taille; i++){
							if (maGrilledeBateauxPlacés[caseorigine.cX][caseorigine.cY + i] == EtatCase.VIDE){
								return true;										
							}
							else
								return false;
						}
					}
					else
						return false;
				}
				/*test direction EST*/
				if (direction == Direction.EST){
					if (caseorigine.cX + taille >= 0 & caseorigine.cX + taille <=10){
						int i;
						for (i=0; i<taille; i++){
							if (maGrilledeBateauxPlacés[caseorigine.cX + i][caseorigine.cY] == EtatCase.VIDE){
								return true;										
							}
							else
								return false;
						}
					}
					else
						return false;
				}
				else
					return false;
						
			}
			else
				return false;
		}
		else
			return false;				
	}
	
	public boolean checkBateauxTouché(Case caseJouée){
		/*joueur courant est joueur 1*/
		if (Partie.joueurCourant == joueur1){
			int i;
			while (i<Bateaux.nbMaxCase & Partie.joueur2.Bateaux.TabBateaux[i] != caseJouée)
				i++;
			if (i == Bateaux.nbMaxCase)
				return false;
			else{
				return true;
				Partie.joueur2.Bateaux.TabBateaux[i] = new Case(-1;-1);
			}
		}
		/*joueur courant est joueur 2*/
		if (Partie.joueurCourant == joueur2){
			int i;
			while (i<Bateaux.nbMaxCase & Partie.joueur1.Bateaux.TabBateaux[i] != caseJouée)
				i++;
			if (i == Bateaux.nbMaxCase)
				return false;
			else{
				return true;
				Partie.joueur1.Bateaux.TabBateaux[i] = new Case(-1;-1);
			}
		}
	}
	
	public void majTabBateaux(Case caseJouée){
		int i;
		while (this.TabBateaux[i] != caseJouée)
			i++;
		this.TabBateaux[i] = new Case(-1,-1);		
	}
	
}
