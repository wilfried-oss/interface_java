package interface_trie;

public class TrieurCroissant implements ITriable {


	@Override
	public void trier(int[] tableau) {
		int temp;
		for(int i = 0; i < tableau.length - 1; i++) {
			for(int j = 0; j < tableau.length - i - 1; j++) {
				if(tableau[j] > tableau[j + 1]) {
					temp = tableau[j];
					tableau[j] = tableau[j + 1];
					tableau[j + 1] = temp;
				}
			}
		}
	}
}
