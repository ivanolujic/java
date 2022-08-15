package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
		// Program učitava dva broja
		// ispisuje zbroj dvaju učitanih brojeva
		// Kreirati metode:
		// ucitaj
		// izracunaj
		// ispisi
		
		public static void main(String[] args) {
			
			//skraćena verzija - sve u jednom
			ispisi(izracunaj(ucitaj("Prvi"),ucitaj("Drugi")));
			
			// ili duža, pojedinačna verzija
			int a= ucitaj("Prvi");
			int b= ucitaj("Drugi");
			int c=izracunaj(a, b);
			ispisi(c);
			
			
		}
		
		
		
		
		
		
		static int ucitaj(String poruka) { // "poruka" je string koji se pojavi kao poruka u Input Dialogu
			return // vraća učitanu vrijednost int "ucitaj"
					Integer.parseInt(
							JOptionPane.showInputDialog(poruka));
		}
		
		static int izracunaj(int a, int b) {// računa zbroj dva broja
			return a+b;
		}
		
		static void ispisi(int b) {
			System.out.println(b);
		}


}
