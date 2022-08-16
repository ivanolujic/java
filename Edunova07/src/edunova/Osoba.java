package edunova;

//1.princip OOP-a Klasa/objekt
//Klasa je opisnik objekta
public class Osoba {
	
	//int sifra; OVO SE NE RADI JER NIJE PO OOP PRINCIPU
	// String ime;
	
	//2.princip OOP-a Učahurivanje
	

	// načini pristupa:
	// package scope (bez navođenja načina)
	// class scope (private)
	// class scope (protected - nasljeđivanje)
	// vidljivo svima (public)
	
	// Kada klasa sakrije svoja svojstva
	private int sifra;
	// i učini ih dostupnima putem
	// tzv. geter i seter metodama

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	

}
