package edunova;

import javax.swing.JOptionPane;

public class Zadatak06 {
	
	// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inače ispisuje njihovu razliku

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		int prviParni=prviBroj%2;
		int drugiParni=drugiBroj%2;
		int rezultat=0;
		
		if (prviParni==0 & drugiParni==0) {
			rezultat=prviBroj+drugiBroj;
		} else {
			rezultat=prviBroj-drugiBroj;
		}
		
		System.out.println(rezultat);
		

	}

}
