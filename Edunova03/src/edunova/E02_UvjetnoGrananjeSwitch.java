package edunova;

public class E02_UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		
		// primjer ispisa ocjene tekstualno
		
		int ocjenaBrojcano=4;
		
		if (ocjenaBrojcano == 2) {
			System.out.println("Dovoljan (2)");
		} else if (ocjenaBrojcano == 3) {
			System.out.println("Dobar (3)");
		} else if (ocjenaBrojcano == 4) {
			System.out.println("Vrlo dobar (4)");
		} else if (ocjenaBrojcano == 5) {
			System.out.println("Izvrstan (5)");
		} else if (ocjenaBrojcano == 1) {
			System.out.println("Nedovoljan (1)");
		} else {
			System.out.println("Nije ocjena");
		} 
		
		// ili pomoću naredbe SWITCH
		String ocjena; // definiramo novi string kojemu ćemo dodijeliti
		// vrijednost ocjeneBrojcano
		
		switch (ocjenaBrojcano) {
		case 1: // slučaj kada je vrijednost ocjenaBrojcano = 1
			ocjena = "Nedovoljan (1)";
			break; // prekida petlju jer je pronašao rezultat
		case 2:
			ocjena = "Dovoljan (2)";
			break;
		case 3:
			ocjena="Dobar (3)";
			break;
		case 4:
			ocjena="Vrlo dobar (4)";
			break;
		case 5:
			ocjena="Izvrstan (5)";
			break;
		default: // za sve slučajeve koji nisu gore nabrojani
			ocjena="Nije ocjena";
		}
		
		System.out.println(ocjena);

	}

}
