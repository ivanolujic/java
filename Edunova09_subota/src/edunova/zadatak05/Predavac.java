package edunova.zadatak05;

public class Predavac extends Osoban {
	
	private int oib;
	
	

	public Predavac() {
		super();
	}

	public Predavac(String ime, String prezime, int oib) {
		super(ime, prezime);
		this.oib = oib;
	}

	public int getOib() {
		return oib;
	}

	public void setOib(int oib) {
		this.oib = oib;
	}
	
	
	
	

}
