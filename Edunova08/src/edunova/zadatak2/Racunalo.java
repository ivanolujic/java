package edunova.zadatak2;

public class Racunalo extends Proizvodjac {
	
	private String vrstaPrikljucka;
	
	

	public Racunalo() {
		super();
	}
	
	

	public Racunalo(String naziv, String vrstaPrikljucka) {
		super(naziv);
		this.vrstaPrikljucka = vrstaPrikljucka;
	}



	public String getVrstaPrikljucka() {
		return vrstaPrikljucka;
	}

	public void setVrstaPrikljucka(String vrstaPrikljucka) {
		this.vrstaPrikljucka = vrstaPrikljucka;
	}
	
	

}
