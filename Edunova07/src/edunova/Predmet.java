package edunova;

public class Predmet {
	
	private String naziv;
	private int ocjena;
	private Profesor profesor; // prethodno smo formirali klasu Profesor
	// i unijeli joj atribute, te napravili getere i setere u ovoj klasi
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOcjena() {
		return ocjena;
	}
	public void setOcjena(int ocjena) {
		this.ocjena = ocjena;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	

}
