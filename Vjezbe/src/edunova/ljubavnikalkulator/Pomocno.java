package edunova.ljubavnikalkulator;

import javax.swing.JOptionPane;

public class Pomocno {
	
	// Metoda za unos stringa bez razmaka i sa malim slovima
		//------------------------------------------------------------
		public static String ucitajString(String poruka) {
			String s;
			while(true) {
				s=JOptionPane.showInputDialog(poruka);
				if(s.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, 
							"Obvezan unos");
					continue;
				}
				return s.trim().toLowerCase();
				
			}
		}


}
