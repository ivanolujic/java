package edunova.zadatak2;

public class Televizor extends Proizvodjac{
	
	private String vrstaDaljinskog;
	
	

	public Televizor() {
		super();
	}
	
	

	public Televizor(String naziv, String vrstaDaljinskog) {
		super(naziv);
		this.vrstaDaljinskog = vrstaDaljinskog;
	}



	public String getVrstaDaljinskog() {
		return vrstaDaljinskog;
	}

	public void setVrstaDaljinskog(String vrstaDaljinskog) {
		this.vrstaDaljinskog = vrstaDaljinskog;
	}
	
	

}
