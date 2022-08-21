package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// za unešena 2 broja, program ispisuje
	// sumu brojeva između njih, uključujiči i ta dva broja

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int suma=0;
		int min, max;
		if (prviBroj>drugiBroj) {
			min=prviBroj;
			max=drugiBroj;
		} else {
			min=drugiBroj;
			max=prviBroj;
			
		}
		
		for (int i=min; i<=max; i++) {
			suma=suma+i;
			
		}
		
		System.out.println(suma);
		
		// ili
		
		int i = prviBroj;
		int j = drugiBroj;


		for (int k = i >= j ? j : i; k <=( j >= i ? j : i); k++) {

			suma += k;

		}
		System.out.println(suma);

	}

}
