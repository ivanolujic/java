package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class LjubavniKalkulator {

	public static void main(String[] args) {

		String prvoIme = Pomocno.ucitajString("Unesi prvo ime");
		String drugoIme = Pomocno.ucitajString("Unesi drugo ime");
		
		System.out.println(prvoIme);
		System.out.println(drugoIme);
		System.out.println("-----------------------");
		
		String imena = prvoIme+drugoIme;
		System.out.println(imena);
		
		int niz[] = new int[imena.length()];
		int brojac=0;
		
		for (int i=0; i<imena.length();i++) {// formiramo niz brojeva slova u imenima
			brojac = Pomocno.brojSlova(imena, imena.charAt(i));
			niz[i]=brojac;
		}
		
		System.out.print(Arrays.toString(niz));
		//-------------------------------------------------------------------------------------
		
		
		System.out.println(Arrays.toString(Pomocno.zbroj(niz)));
		
		//int niz[] = {3,2,1,3,2,1,5,6,7};	
		
	}
		
			
		
		
		
		
		


	
	
	
	
	
	public class Pomocno {
		
		// Metoda za unos stringa bez razmaka i sa malim slovima
			//------------------------------------------------------------
			private static String ucitajString(String poruka) {
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
			
		// Metoda koja broji koliko se pojedino slovo ponavlja u stringu
		// ----------------------------------------------------------------
			
			private static int brojSlova (String ime, Character slovo) {
				int ukupno=0;
				for (int i=0;i<ime.length();i++) {
					if(ime.charAt(i)==slovo) {
						ukupno++;
					}
				}
				
				
				return ukupno;
				
			}
			
		// Metoda koja prima niz brojava i zbraja unutarnje sa vanjskim
		//------------------------------------------------------------------------
			private static int[] zbroj(int[] niz) {
				
				if(niz.length<=2) {
					return niz;
				}
				int noviNiz []= new int [niz.length];
				int duljina=niz.length%2;// provjeravam da li je broj članova niza paran ili neparan
				int p;
				if(duljina==0) {
					p=niz.length/2;
				} else {
					p=(niz.length/2)+1;
			}
				int nizPovrat[] = new int [p];// definiranje duljine novog niza koji će metoda vratiti
				
				for (int j=0;j<niz.length;j++) {
					noviNiz[j]=niz[j];
				}
				
				int brojac1 = 0;
				int brojac2 = niz.length-1;
				if (duljina==0) {
					for (int k=0;k<p;k++) {
						nizPovrat[k]=niz[brojac1]+niz[brojac2];
						brojac1++;
						brojac2--;
						}
						
					} else {
					for (int k=0;k<p-1;k++) {
						nizPovrat[k]=niz[brojac1]+niz[brojac2];
						brojac1++;
						brojac2--;
						}
					nizPovrat[brojac1]=niz[p-1];
						
					}
				System.out.print(Arrays.toString(nizPovrat));
				return zbroj(nizPovrat);
			
			
			
	


	}

}
}
			
	

