package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	
	// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8

	public static void main(String[] args) {
		
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj između 1 i 999")
				);
		
		int rezultat=0;
		
		if (broj<1 | broj>999) {
			System.out.println("Unešen je krivi broj");
		} else if (broj>100) {
			rezultat=broj/100;
		} else if (broj>10 & broj <100) {
			rezultat=broj/10;
		} else {
			rezultat=broj;
		}
		
		System.out.println(rezultat);

	}

}
