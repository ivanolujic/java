package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		// Za uneseni dvoznamenkasti broj
		// ispišite jediničnu vrijednost
		
		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
		);
		
		int rezultat = broj % 10;
		
		System.out.println(rezultat);
		
		// ispisati desetice
		
		int desetica = broj / 10;
		
		System.out.println(desetica);
		
		
		

	}

}
