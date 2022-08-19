package edunova.zadatak1;

public class Sisavac extends Toplokrvni {
	
	private int daniTrudnoce;
	
	

	public Sisavac() {
		super();
	}
	

	public Sisavac(String naziv, double temperatura, int daniTrudnoce) {
		super(naziv, temperatura);
		this.daniTrudnoce = daniTrudnoce;
	}



	public int getDaniTrudnoce() {
		return daniTrudnoce;
	}

	public void setDaniTrudnoce(int daniTrudnoce) {
		this.daniTrudnoce = daniTrudnoce;
	}
	
	

}
