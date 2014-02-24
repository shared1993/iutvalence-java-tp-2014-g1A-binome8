package bataille_navale;

import java.util.*;

public class Grille {
	//atributs
	/*grille avec en abscisse: les lettres en majuscule de A a J
	 * en ordonnée les chiffres de 0 a 10, le tout sous forme de string
	 */
	private String[][] grille;

	public Grille()
	{
	grille = new String[][]{ {'A','B','C','D','E','F','G','H','I','J'},{'1','2','3','4','5','6','7','8','9','10'} };
	
	}
}
