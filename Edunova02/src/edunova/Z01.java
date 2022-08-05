package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i trećeg
		// umanjeno za drugi broj

	public static void main(String[] args) {
		
		double prviBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		double drugiBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		double treciBroj = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi treći broj")
				);
		
		double rezulat = (prviBroj*treciBroj)-drugiBroj;
		
		System.out.println(rezulat);

	}

}
