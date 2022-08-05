package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Za unesena dva cijela broja
		// ispišite rezutat djeljenja

	public static void main(String[] args) {


		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi cijeli broj")
				);
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi cijeli broj")
				);
		
		double rezultat = (double)prviBroj/drugiBroj;
		
		System.out.println(rezultat);

	}

}
