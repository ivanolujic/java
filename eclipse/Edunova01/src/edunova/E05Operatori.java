package edunova;

public class E05Operatori {

	public static void main(String[] args) {
		
		// Čitati: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.htmlb
		
		int i=4,j=8;
		
		int z = i+j;
		System.out.println(z); // ili
		System.out.println(i+j);
		
		z=i-j;
		z=i*j;
		z=i/j; // neće dati rezultat iza decimale, već samo cijeli broj
		System.out.println(z);
		
		float rez = i/j; // isto nije dobro i ne daje očekivani rezultat
		System.out.println(rez);
		
		// u ovom slučaju je varijabla rez definirana u prethodnom retku
		// inače bi doljnja sintagma morala glasiti
		// float rez = (float)i/j;
		
		rez = (float)i/j; // ISPRAVNO
		System.out.println(rez);
		
		// modulo
		// ostatak nakon cjelobrojnog djeljenja
		// koristi kod definiranja parnih i neparnih brojeva
		
		System.out.println(10/3);
		System.out.println(10%3);
		
		
		
		
		
		

	}

}
