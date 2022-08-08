package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// Deklarirajte niz od 4 cijela broja,
		// u niz učitajte vrijednosti od korisnika
		// ispišite sumu svih upisanih vrijednosti

	public static void main(String[] args) {
		
		int niz[]=new int[4];
		int suma=0;
		
		for (int i=0;i<4;i++) {
			niz[i]=Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj "+(i+1))
					);
			suma=suma+niz[i];
			
		}
		
		System.out.println(suma);

	}

}
