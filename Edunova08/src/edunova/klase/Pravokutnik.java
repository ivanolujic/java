package edunova.klase;

import java.util.Objects;

public class Pravokutnik {
	
	private int sirina;
	private int visina;
	
	// konstruktor je metoda koja se
	// poziva s ključnom riječju NEW
	
	public Pravokutnik() {
		System.out.println("Pozvan prazan konstruktor od pravokutnika");
	}
	
	public Pravokutnik(int sirina, int visina) {
		//super(); ovo zasad brišemo
		this.sirina = sirina;
		this.visina = visina;
	}

	public int getSirina() {// geteri i seteri su isto metode
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	
	public int povrsina () {// izračun površine kao zasebna metoda
		return sirina*visina;
		
		
	}
	
	@Override
	public String toString() {
		return sirina + "-"+visina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sirina, visina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pravokutnik other = (Pravokutnik) obj;
		return sirina == other.sirina && visina == other.visina;
	}
	
	

}
