package edunova;

import javax.swing.JOptionPane;

public class E05ObradaPogresaka {

	public static void main(String[] args) {
		
		// try catch metoda
		// prilikom kucanja koda, nakon unosa "try" potrebno
		// je CTRL-space da ponudi trycatch u izborniku
		
		int i=0;
		while(true) {
			try { // pod try ide ono što želimo da se unese i kada
				// se ispravno unese, prekida se trycatch sa break
				i=Integer.parseInt(JOptionPane.showInputDialog("broj"));
				break;
				
			} catch (Exception e) {// pod catch unosimo ono što se 
				// događa ako se unese krivi podatak, pa se program
				// vraća na try dio
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
				
		}
		System.out.println(i);

	}

}
