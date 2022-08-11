package edunova;

import javax.swing.JOptionPane;

public class Zadatak06 {
	
	//program osigurava unos niza
	// znakova (String) koji ima
	// minimalno 3 znaka
	// ako nema tri znaka ispisuje korisniku
	// poruku: Minimalno 3 znaka

	public static void main(String[] args) {
		
		
		while (true) {
			try {
				String niz = JOptionPane.showInputDialog("Unesi niz od tri znaka");
				int duljina=niz.length();
				if (duljina==3) {
					System.out.println(niz);
					break;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Nije unešen niz od 3 znaka");
			}
		}
		

	}

}
