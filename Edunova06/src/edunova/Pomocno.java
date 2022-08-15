package edunova;

import javax.swing.JOptionPane;

public class Pomocno {
	
	
	/**
	 * Metoda osigurava unos cijelog broja
	 * koji može biti u cijelom rasponu
	 * int tip podatka
	 * @param poruka Koja se prikazuje korisniku
	 * @return Učitani cijeli broj
	 */
	static int ucitajInt(String poruka) {// metoda koja učitava Integer uz siguran unos
		while (true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, 
						"Niste unijeli cijeli broj");
			}
		}
		
	
	}
	
	/**
	 * Metoda osigurava unos cijelog
	 * POZITIVNOG broja
	 * int tip podatka
	 * @param poruka Koja se prikazuje korisniku
	 * @param pozitivni "true" ako je broj pozitivan
	 * @return Učitani pozitivan cijeli broj
	 */
	static int ucitajInt(String poruka, boolean pozitivni) {
		int i=ucitajInt(poruka);
		if(!pozitivni) {
			return i;
		}
		while(true) {
			if(i<0) {
				JOptionPane.showMessageDialog(null, 
						"Učitani broj mora biti pozitivan");
				i=ucitajInt(poruka);
				continue;
			}
			return i;
		}
	}

}
