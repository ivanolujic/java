package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
	// Za unesena dva cijela broja
		// program ispisuje najveći

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi cijeli broj")
				);
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi cijeli broj")
				);
		
		System.out.println("Veći broj je:");
		System.out.println(prviBroj > drugiBroj ? prviBroj : drugiBroj);
		
		
		
		

	}

}
