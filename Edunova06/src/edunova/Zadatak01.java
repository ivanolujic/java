package edunova;

public class Zadatak01 {
	
		// Metoda prima niz cijelih brojeva
		// metoda vraća najmanji element niza
		// metoda se zove najmanji
	
	public static void main(String[] args) {
		int [] brojevi= {2,5,4,6,1,8,7};
		System.out.println(najmanji(brojevi));
	}
	
	static int najmanji(int[] niz) {
		int nm = Integer.MAX_VALUE; //postavlja prvo najveći broj niza
		for(int i:niz) { // prolazi kroz cijeli niz
			if(i<nm) {// provjerava da li je broj niza manji od maksimalnog
				nm=i; // ako je manji, onda taj postaje nm, odnosno najmanji
			}
		}
		return nm; // zadnji koji ostane je najmanji
	}

}

