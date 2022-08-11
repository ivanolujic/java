package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
		// Korisnik unosi dimenzije 
		// matrice (x i y)
		// program puni matricu slučajnim 
		// vrijednostima između 5 i 9
		// program ispisuje izgrađenu matricu

	public static void main(String[] args) {
		
		int red = Integer.parseInt(
				JOptionPane.showInputDialog("Broj redova?"));
		int kolona = Integer.parseInt(
				JOptionPane.showInputDialog("Broj kolona?"));
		
		int matrica[][] = new int[red][kolona];
		
		for (int i=0;i<red;i++) {
			for (int j=0;j<kolona;j++) {
				int sb = (int)((Math.random()*(9-5))+5);
				matrica [i][j] = sb;
			}
			
		}
		
		for (int i=0;i<red;i++) {
			for (int j=0;j<kolona;j++) {
				System.out.print(matrica [i][j]);	
			}
			System.out.println();
			
		
	
		}
	}
	

}
