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
	public static int ucitajInt(String poruka) {// metoda koja učitava Integer uz siguran unos
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
	
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {// trim služi da pobriše eventualne razmake ispred i iza unešenog stringa
				JOptionPane.showMessageDialog(null, // trim ne dira razmak između dvije riječi
						"Obvezan unos");
				continue;// bez continue bi izbacio poruku i vratio prazan string
			}
			return s;
			// return 0; ovaj je samo upisan da nam ne baca grešku
			// dok upisujemo try catch. Poslije se može obrisati
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
	public static int ucitajInt(String poruka, boolean pozitivni) {
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
		// prethodna metoda provjerava da li je unešeni broj
		// pozitivan. Ima isti naziv kao i prethodna, pa se može odabrati
		// da li će kontrolirati samo unos cijelog broja ili i unos
		// pozitivnog broja - Pogledati Zadatak04 za korištenje
	}

}
