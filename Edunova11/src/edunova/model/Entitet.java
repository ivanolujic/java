package edunova.model;

public abstract class Entitet {
	
	private Integer sifra;
	
	

	public Entitet() {
		super();
	}

	public Entitet(Integer sifra) {
		super();
		this.sifra = sifra;
	}

	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	
	

}
