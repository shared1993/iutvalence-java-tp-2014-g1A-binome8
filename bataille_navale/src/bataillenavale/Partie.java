package bataillenavale;

public class Partie {
	private Joueur joueur1;
	private Joueur joueur2;
	private Joueur joueurCourant;
	
	public Partie() {
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		DemarerPartie();
		if (checkPartieGagné() == true)
			FinPartie();
	}
	
	public void DemarerPartie() {
		Joueur joueurCourant;
		while (checkPartieGagné() == false){
			joueurCourant = this.joueur1;
			JouerCoup(x,y);
			checkPartieGagné();
			joueurCourant = this.joueur2;
			joueurCoup(x,y);
			checkPartieGagné();
		}
	
	public void FinPartie(){
		
	}
			
	}
		
