package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class E04ForPetlja {

	public static void main(String[] args) {
		
		// petlje nam služe za ponavljanje koda
		for (int i=0;i<10;i=i+1) {
			System.out.println("Osijek");
		}
		
		// FOR petlja obavezno ima varijablu
		// koja mijenja vrijednost
		
		for (int i=0;i<10;i+=1) { // konstrukcija "i+=1" znači da se i povečava za 1, isto kao i gore
			System.out.println(i);
		}
		
		// primjeri
		for (int i=10;i>0;i-=1) {
			System.out.println(i);
		}
		
		for (int i=0;i<100;i+=10) {
			System.out.println(i);
		}
		
		// koristiti ćemo i++ za inkrement
		// i++ označava da se i povećava (prvi plus) za 1 (drugi plus)
		for (int i=0; i<10;i++) {
			System.out.println(i);
		}
		
		// FOR petlja i jednodimenzionalni niz
		int[] niz = {2,3,2,3,3,2};
		
		for (int i=0;i<niz.length-1;i++) {
			System.out.println(niz[i]);
		}
		
		// ispis teksta sa svakim slovom u novom redu
		String ime = "Edunova";
		for (int i=0;i<ime.length();i++) {
			System.out.println(ime.charAt(i));
		}
		
		// UGNJEŽĐIVANJE petlji
		// formiranje tablice množenja do 100
		int d=10;
		int [][] tablica = new int [d][d];
		
		for (int i=0;i<d;i++) {
			for (int j=0;j<d;j++) {
				tablica [i][j]=(i+1)*(j+1);
			}
		}
		
		for (int i=0;i<d;i++) {
			System.out.println(Arrays.toString(tablica[i]));
		}
		
		// FOR petlja se može preskočiti
		
		for (int i=0;i<d;i++) {
			if(i==3 || i==5) {
				continue; // short curcuiting
				// nastavlja sa brojačem petlje, bez da se izvrši
				// printanje kada su vrijednosti i= 3 ili 5
			}
			System.out.println(i);
			
		}
		
		// isto može i ovako
		for (int i=0;i<10;i++) {
			if(i!=3 && i!=5) {
				System.out.println(i);
			}
		}
		
		// nasilno prekidanje petlje
		
		for (int i=0;i<10;i++) {
			if (i==4) {
				break; // kada brojač dođe do 4, petlja se prekida
			}
			System.out.println(i);
		}
		
		int brojac = 0;
		int b = 25683;
		boolean prim=true;
		
		for (int i=2;i<b;i++) {
			brojac++;
			if(b%i==0) {
				// sada već na broju 2 znam da ne moram tražiti dalje
				prim=false;
				break;
			}
		}
		
		if (prim) {
			System.out.println(b+" je prim, "+brojac);
		} else {
			System.out.println(b+" nije prim, "+brojac);
		}
		
		
		vanjska:
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if(j==1) {
					break vanjska;
				}
			}
		}
			
		System.out.println((100+1)*50);// formula za zbroj svih brojava do 100
		// isto zbrajanje sa petljom
		int suma=0;
		for (int i=1;i<101;i++) {
			suma+=i;
		}
		System.out.println(suma);
		
		//int i, s=0; for(i=1;i<=100;i++) s+=i;

				// int i, s; for(i=1, s=0;i<=100; s+=i, i++);
		//
				// int i=1, s=0; for( ; i<=100; i++){ s+=i; }
		//
//				 int i, s=0; for(i=1; ; i++){ if(i<=100) s+=i; else break;}
		//
//				 int i, s=0; for(i=1;i<=100;){ s+=i; i++;}
		//
//				 int i, s=0; for(i=1; ; ){ if(i<=100) {s+=i; i++;} else break;}
		//
//				 int i=1, s=0; for( ; i<=100 ; ){ s+=i; i++;}
		//
//				  int i=1, s=0; for( ; ; i++){if(i<=100)  s+=i; else break;}
		//
//				 int i=1, s=0; for( ;  ; ){if(i<=100) {s+=i; i++;} else break;} 
//				
		//	
		
		
		// beskonačna petlja
		// for(int i=0;i>0;i++) // OVO NIJE BESKONAČNA PETLJA
		
		suma=0;// beskonačna petlja koja se prekida kada uneseš "-1"
		int i=0;
		for(;;) {
			i=Integer.parseInt(JOptionPane
					.showInputDialog("Daj broj"));
			if(i==-1) {
				break;
			}
			suma+=i;
		}
		System.out.println(suma);
		
		
		
		

	}

}
