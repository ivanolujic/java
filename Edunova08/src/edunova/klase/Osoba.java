package edunova.klase;

//DZ: Naučiti metode dostupne na klasi Object
//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//Apstraktna klasa je ona klasa koja ne može imati instancu
//a kreira se da bi ju druge klase nasljedile

public abstract class Osoba {// klasa Polaznik je povezana
	// sa klasom Osoba, a ona je povezana sa klasom "Object", jer je
	// Osoba objekt (nije nužno navoditi "extends Object", ali se može
	
	private String ime;
	private String prezime;
	
	// "prazan" konstruktor
	public Osoba() {
		super();
	}
	
	// "puni" konstruktor
	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	
	
	public String getIme() {
		return ime;
	}
	
	

	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override
		public String toString() {
			//return ime + " " + prezime; ovo nije dobra praksa
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append(" ").append(prezime);
		return sb.toString();
		}
	

}
