package edunova.model;

import java.math.BigDecimal;

public class Polaznik extends Osoba{
	
	private BigDecimal nakanada;
	private BigDecimal prijevoz;
	private BigDecimal ulaznica;
	
	
	public Polaznik(int sifra, String ime, String prezime, BigDecimal nakanada, BigDecimal prijevoz,
			BigDecimal ulaznica) {
		super(sifra, ime, prezime);
		this.nakanada = nakanada;
		this.prijevoz = prijevoz;
		this.ulaznica = ulaznica;
	}
	public Polaznik() {
		super();
	}
	public BigDecimal getNakanada() {
		return nakanada;
	}
	public void setNakanada(BigDecimal nakanada) {
		this.nakanada = nakanada;
	}
	public BigDecimal getPrijevoz() {
		return prijevoz;
	}
	public void setPrijevoz(BigDecimal prijevoz) {
		this.prijevoz = prijevoz;
	}
	public BigDecimal getUlaznica() {
		return ulaznica;
	}
	public void setUlaznica(BigDecimal ulaznica) {
		this.ulaznica = ulaznica;
	}
	@Override
	public BigDecimal getUkupno() {
		// TODO Auto-generated method stub
		//return null;
		return nakanada.add(prijevoz).add(ulaznica); // add je isto kao i zbrajanje
		// ovdje nismo ponavaljali varijante što ako su parametrni null
		// napravljeno je u predavaču
	}
	
	
	

}
