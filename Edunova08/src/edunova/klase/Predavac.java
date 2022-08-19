package edunova.klase;

public class Predavac extends Osoba {
	
	private String iban;
	
	
// prazan konstruktor
	public Predavac() {
		super();
	}
	
	
// puni konstruktor
	public Predavac(String ime, String prezime, String iban) {
		super(ime, prezime);
		this.iban = iban;
	}


// geteri i seteri
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + iban;
	}

}
