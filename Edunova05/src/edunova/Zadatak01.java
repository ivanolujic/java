package edunova;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadatak01 {
	
	// Deklarirajte niz decimalnih
		// brojeva dužine 12 i svim elementima
		// niza postavite vrijednost 3,14
		// s while petljom

	public static void main(String[] args) {
		
		double niz [] = new double [12];
		
		int i=0;
		
		while (i<12) {
			niz[i] = 3.14;
			i++;
		}
		
		System.out.println(Arrays.toString(niz));

	}

}
