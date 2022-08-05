package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	// Za upisani cijeli broj
		// program ispisuje da li je 
		// parni broj ili ne

	public static void main(String[] args) {
		
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		
		int rez = broj%2;
		
		if (rez==0) {
			System.out.println("Broj je paran");
		} else {
			System.out.println("Broj je neparan");
		}

	}

}
