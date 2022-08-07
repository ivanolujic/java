package edunova;

import java.util.Arrays;

public class E01JednodimenzionalniNizovi {

	public static void main(String[] args) {
		
		// sinonimi:
		// Array na engleskom
		// nizovi ili polja na hrvatskom
		// mi ćemo koristiti nizovi
		
		int t1=2;
		int t2=-1;
		//..
		int t12=6;
		// ovo nije dobar način za pohranu
		// više vrijednosti istog tipa
		
		// deklaracija niza
		int[] temp;
		
		// niz je objekt, pa ga je potrebno KONSTRUIRATI
		
		temp = new int[12];
		
		// VAŽNO: nizovi počinju sa indeksom 0, a na sa 1
		temp[0]=2;
		temp[1]=-1;
		//..
		// zadnji element
		temp[temp.length-1]=6;// lenght pri konstrukciji je bio [12
								// pa je zadnji 12-1, jer je prvi bio 0
		
		System.out.println(Arrays.toString(temp)); // VAŽNO
		// ova naredba ispisuje sve vrijednosti niza u istom redu
		// oni kojima vrijednost nije zadana, imaju vrijednost 0
		
		// skraćena sintaksa
		int boje[] = new int[4];
		
		//na 2.mjesto u nizu staviti broj 7
		boje[1]=7;
		
		// ispisati samo vrijednost drugog mjesta u nizu
		System.out.println(boje[1]);
		
		// još kraća sintaksa
		int[] vrijednosti = {2,3,3,2,3,8,5,6,7,5,5};
		
		// ispisati prvi i zadnji element niza
		// jedan pored drugoga, odvojeno zarezom
		
		System.out.println(vrijednosti[0] + ","
		+vrijednosti[vrijednosti.length-1]);
		
		//ili
		System.out.print(vrijednosti[0]);// nema nastavka ln iza print, pa ne piše u novom redu
		System.out.print(",");
		System.out.print(vrijednosti[vrijednosti.length-1]);
		System.out.println();// ima nastavak ln, pa prelazi u novi red
		
		// nizovi mogu biti bilo koji tip podatka
		double[] brojevi = new double[5];
		
		//brojevi[0] = true; ne može drugi tip podatka, jer javlja grešku

	}

}
