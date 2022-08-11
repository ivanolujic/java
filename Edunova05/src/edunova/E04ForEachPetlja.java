package edunova;

public class E04ForEachPetlja {

	public static void main(String[] args) {
		
		int[] niz = {1,5,4,2,1,-1,2,4};
		
		// ispiši svaki element niza
		// jedno ispod drugog
		// s for petljom
		
		for (int i=0; i<niz.length-1; i++) {
			System.out.println(niz[i]);
		}
		
		System.out.println("----------------");
		
		// FOREACH
		
		for (int broj:niz) { // prolazi kroz cijeli niz
			// nemamo pristup indeksu
			if(broj==4) {
				continue;
			}
			if (broj==-1) {
				break;
			}
			System.out.println(broj);
		}

	}

}
