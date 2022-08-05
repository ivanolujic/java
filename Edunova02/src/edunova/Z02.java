package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	// Za uneseni dvoznamenkasti broj
		// ispišite jediničnu vrijednost

	public static void main(String[] args) {


		int broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
				);
		
		int jedinica = broj%10;
		
		System.out.println(jedinica);

	}

}
