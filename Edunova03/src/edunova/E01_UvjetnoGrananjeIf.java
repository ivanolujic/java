package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {
		
		// obvezni dio if naredbe
		
		boolean uvjet=true;
		
		// if radi sa boolean tipom podatka
		
		if (uvjet) {
			System.out.println("1");
		}
		
		int i=7;
		
		if (i>0) {
			System.out.println("2");
		}
		
		uvjet = i>0;
		if (uvjet) {
			System.out.println(uvjet);
			System.out.println("3");
		}
		
		// provjeravanje vrijednosti
		if (i==7) {
			System.out.println("4");
		}
		
		// različito
		if (i !=0) {
			System.out.println("5");
		}
		
		
		// logičko AND
		if (i>0 & i<10) {
			System.out.println("6");
		}
		
		// & provjerava UVIJEK oba uvjeta
		// && u slučaju da prvi uvjet nije zadovoljen, drugi se NE provjerava
		if (i>0 && i<10) {
			System.out.println("7");
		}
		
		// logičko OR
		if (i==0 | i==7) {
			System.out.println("8");
		}
		
		// | uvijek provjerava oba uvjeta
		// || u slučaju da je prvi uvjet zadovoljen drugi se NE provjerava
		if (!(i==0 || i==7)) {
			System.out.println("9");
		}
		
		// nije dobra praksa ne koristiti {}
		if (i==1)
			System.out.println("10");
		System.out.println("11");
		
		// NEobavezni dijelovi IF naredbe
		i=1;
		if (i==0) {
			System.out.println("12");
		} else {
			System.out.println("13");
		}
		
		// radi i bez {}
		if (i==0)
			System.out.println("12");
		else
			System.out.println("13");
		
		
		int j = 9; // deklariranje uvije izvan petlje !!
		// ugnježđiovanje
		if (i==1) {
				if (j==9) {
					System.out.println("14");
				} else {
					System.out.println("15");
				}
			}
		
		i=1;
		j=2;
		if (i==1 && j==2) {
			System.out.println("16");
		} else if (i==2 && j==1) {
			System.out.println("17");
		} else {
			System.out.println("18");
		}
		
		// inline IF - tercijarni operator "?"
		System.out.println(i>j ? i:j);
		// ako je i veće od j, ispisuje i, a u protivnom j

	}

}
