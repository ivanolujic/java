package edunova;

public class E01WhilePetlja {

	public static void main(String[] args) {
		
		// WHILE petlja radi s boolean tipom podatka
		//  beskonačna petlja
		
		while(true) {
			break;
		}
		
		// ispisati brojeve od 1 do 10
		
		int i=0;
		while (i<10) {
			i++;
			System.out.println(i);
			continue;
			}
		
		// u FOR petlju se ne mora ući
		for (int t=10;t>10;t++) { // ne ispisuje ništa jer ide od 10, pa dok je veće od 10
			System.out.println("Osijek");
			System.out.println(t);
		}
		
		// u WHILE petlju se ne mora ući
		int t=2;
		while(t>2) {
			System.out.println("Edunova");
		}
		
		

	}

}
