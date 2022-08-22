package edunova.ljubavnikalkulator;

import java.util.Arrays;

public class Pomocno {

	public static void main(String[] args) {
		
	
	
	// Metoda koja prima niz brojava i zbraja unutarnje sa vanjskim
			//------------------------------------------------------------------------
		
					
					int niz[] = {3,2,1,3,2,1,5,6,7};
					System.out.println(niz.length);
					int noviNiz []= new int [niz.length];
					int duljina=niz.length%2;// provjeravam da li je broj članova niza paran ili neparan
					int p;
					if(duljina==0) {
						p=niz.length/2;
					} else {
						p=(niz.length/2)+1;
				}
					System.out.println(p);//PROBA----------------------
					int nizPovrat[] = new int [p];// definiranje duljine novog niza koji će metoda vratiti
					
					for (int j=0;j<niz.length;j++) {
						noviNiz[j]=niz[j];
						System.out.println(noviNiz[j]);//PROBA-------------------
					}
					
					int brojac1 = 0;
					int brojac2 = niz.length-1;
					if (duljina==0) {
						for (int k=0;k<p;k++) {
							nizPovrat[k]=niz[brojac1]+niz[brojac2];
							brojac1++;
							brojac2--;
							System.out.println(nizPovrat[k]);
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
					
					
				}

}