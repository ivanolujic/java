package edunova.zadatak05;

public class Osoban {
	private String ime;
	private String prezime;
	
	
	
	public Osoban() {
		super();
	}
	public Osoban(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	

}
