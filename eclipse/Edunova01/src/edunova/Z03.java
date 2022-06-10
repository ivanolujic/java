package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		// Za unesena dva cijela broja
		// ispišite rezultat dijeljenja
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		double rez = (double) prviBroj / drugiBroj;
		
		System.out.println(rez);
		

	}

}
