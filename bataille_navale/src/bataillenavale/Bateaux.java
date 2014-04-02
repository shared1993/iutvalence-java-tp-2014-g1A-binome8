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
		this.Croiseur = new BateauxCroiseur();
		this.SousMarin = new BateauxSousMarin();
		this.PorteAvion = new BateauxPorteAvion();
		this.Vedette1 = new BateauxVedette1();
		this.Vedette2 = new BateauxVedette2();
		
	}
	
	public void initTabBateaux() {
		int i;
		for (i=0; i<nbMaxCase;i++) 
		{
			TabBateaux[i] = new Case(-1,-1);
		}
	}
	
}

	
	
	 
	
	
}
