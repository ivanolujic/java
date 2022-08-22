package edunova.model;

import java.math.BigDecimal;

public class Ravnatelj extends Osoba {

	public Ravnatelj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ravnatelj(int sifra, String ime, String prezime) {
		super(sifra, ime, prezime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getUkupno() {
		// TODO Auto-generated method stub
		return BigDecimal.ZERO;
	}
	
	
	
	

	
}
