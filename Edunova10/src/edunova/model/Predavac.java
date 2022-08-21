package edunova.model;

import java.math.BigDecimal;

public class Predavac extends Osoba {
	
	private BigDecimal  kotizacija;// kod obrada iznosa u valutama, dobro je koristiti ovu metodu
	// zato što double na većem broju podataka ne zaokružuje najbolje decimale, pa može
	// biti razlika prilikom obrada (npr. može biti razlika u lipama, a što je problem ako
	// se radi o izvještajima za npr. poreznu upravu
	
	private BigDecimal rucak;
	
	

	public Predavac(int sifra, String ime, String prezime, BigDecimal kotizacija, BigDecimal rucak) {
		super(sifra, ime, prezime);
		this.kotizacija = kotizacija;
		this.rucak = rucak;
	}

	public Predavac() {
		super();
	}

	public BigDecimal getKotizacija() {
		return kotizacija;
	}

	public void setKotizacija(BigDecimal kotizacija) {
		this.kotizacija = kotizacija;
	}

	public BigDecimal getRucak() {
		return rucak;
	}

	public void setRucak(BigDecimal rucak) {
		this.rucak = rucak;
	}
	
	

}
