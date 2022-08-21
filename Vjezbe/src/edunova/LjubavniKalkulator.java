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
			System.out.print(niz[i]);
		}
		
		//String broj = Arrays.toString(niz); // dobiveni niz brojeva pretvaram u string
		System.out.println(Pomocno.zbroj(niz));
		
			
		
	}
		
			
		
		
		
		
		


	
	
	
	
	
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
			
		// Metoda koja broji koliko se pojedino slovo ponavlja u stringu
		// ----------------------------------------------------------------
			
			public static int brojSlova (String ime, Character slovo) {
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
			public static int[] zbroj(int[] niz) {
				
				String broj = Arrays.toString(niz);
				int noviNiz []= new int [broj.length()];
				int duljina=broj.length()%2;// provjeravam da li je broj članova niza paran ili neparan
				int p;
				if(duljina==0) {
					p=broj.length()/2;
				} else {
					p=(broj.length()/2)+1;
			}
				int nizPovrat[] = new int [p];// definiranje duljine novog niza koji će metoda vratiti
				
				for (int j=0;j<broj.length();j++) {
					noviNiz[j]=broj.charAt(j);
				}
				
				
				if (duljina==0) {
					for (int k=0;k<duljina;k++) {
						for (int i=0;i<(broj.length()/2);i++) {
							nizPovrat[k]=noviNiz[i]+noviNiz[broj.length()-i];
						}
						
					}
				} else {
					for (int k=0;k<duljina;k++) {
						for (int i=0;i<(broj.length()/2);i++) {
							nizPovrat[k]=noviNiz[i]+noviNiz[broj.length()-i];
							nizPovrat[(p/2)+1]=noviNiz[(broj.length()/2)+1];
						}
						
					}
				
				
			}
				return nizPovrat;
			
			
			
	


	}

}
}
			
	

