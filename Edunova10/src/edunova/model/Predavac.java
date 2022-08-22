package edunova.model;

import java.math.BigDecimal;

public class Predavac extends Osoba { // nakon što smo naknadno na klasi Osoba dodali novu
	// metodu BigDecimal getUkupno, ovdje se pojavljuje greška zbog toga što ta metoda
	// nije implementirana u ovu metodu koja nasljeđuje osobu
	// zato treba otići na "žaruljicu" kraj linije i kliknuti na
	// ADD UNIMPLEMENTED METHOD
	// nakon toga se na dnu metode pojavi Override za tu metodu
	
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

	@Override
	public BigDecimal getUkupno() {
		// TODO Auto-generated method stub
		//return null; kod formiranja automatski se postavi na null, ali mi to ne želimo
		if(kotizacija==null && rucak==null) {
			return BigDecimal.ZERO;
		}
		if(kotizacija==null) {
			return rucak;
		}
		if(rucak==null) {
			return kotizacija;
		}
		return kotizacija.add(rucak);//add radi isto što i zbrajanje
	}
	
	

}
