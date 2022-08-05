package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
	// Za upisana 3 cijela broja
		// program ispisuje najveći

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi cijeli broj")
				);
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi cijeli broj")
				);
		int treciBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi treći cijeli broj")
				);
		
		System.out.println("Najveći broj je:");
		
		if (prviBroj>drugiBroj & prviBroj>treciBroj) {
			System.out.println(prviBroj);
		} else if (drugiBroj>prviBroj & drugiBroj>treciBroj) {
			System.out.println(drugiBroj);
		} else if (treciBroj>drugiBroj & prviBroj<treciBroj) {
			System.out.println(treciBroj);
		} else {
			System.out.println("Svi brojevi su jednaki");
		}
		

	}

}
