package edunova.klase;

public class Polaznik extends Osoba { // sa EXTENDS smo omogučili da
	// klasa Polaznik naslijedi osobine klase Osoba (ime i prezime)
	
	private String brojUgovora;
	

	public Polaznik() {// poziva se konstruktor klase Osoba jer Polaznik nasljeđuje klasu Osoba
	super(); // super znači da se obrača nadklasi, u ovom slučaju klasi Osoba
}
	
	// slijedeće se dobije odabirom Source/Generate constructor using fields
		//zatim se u polju "Select super constructor to invoke"
		// odabere "Osoba(String, String)
	public Polaznik(String ime, String prezime, String brojUgovora) {
		super(ime, prezime);
		this.brojUgovora = brojUgovora;
	}
	

	public String getBrojUgovora() {
		return brojUgovora;
	}

	

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	

}
