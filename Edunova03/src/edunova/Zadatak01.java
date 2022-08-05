package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	
	// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10 
		// inače ispisuje Edunova

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi cijeli broj")
				);
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi cijeli broj")
				);
		
		int rezultat = prviBroj+drugiBroj;
		
		if (rezultat>10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Edunova");
		}

	}

}
