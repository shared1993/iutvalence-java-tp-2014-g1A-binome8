/* TODO JavaDoc. */
/* TODO Package avec un meilleur nom. */
package bataillenavale;

public class Grille {
	//atributs
	/*grille avec en abscisse: les lettres en majuscule de A a J
	 * en ordonn�e les chiffres de 0 a 10, le tout sous forme de string
	 */
    /* TODO Pourquoi des String ? */
	private String[][] grille;

	public Grille()
	{
        /* TODO En plus, ça ce n'est pas des String. */.
	grille = new String[][]{ {'A','B','C','D','E','F','G','H','I','J'},{'1','2','3','4','5','6','7','8','9','10'} };
	
	}
}
