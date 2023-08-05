package interface_trie;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

	// Méthode pour afficher les tableaux 
	public static void affiche(int[] tab) {
		System.out.print("[");
		for(int elmt : tab) {
			System.out.print(elmt + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void trier(int[] tableau, ITriable trieur) {
		trieur.trier(tableau);
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] tableau = new int[10];
		
		for(int i = 0; i < 10; i++) 
			tableau[i] = random.nextInt(200);
		
		
		
		affiche(tableau);
		
		trier(tableau, new TrieurCroissant());

		affiche(tableau);
		trier(tableau, new TrieurDecroissant());
		affiche(tableau);
		
	}

}
