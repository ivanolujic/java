package edunova.zadatak2;

import util.Pomocno;

public class Main {

	public static void main(String[] args) {
		
		Racunalo r = new Racunalo();
		r.setNaziv(Pomocno.ucitajString("Unesi naziv proizvođača"));
		r.setVrstaPrikljucka(Pomocno.ucitajString("Unesi vrstu priključka"));
		
		
		Televizor t = new Televizor();
		r.setNaziv("Samsung");
		r.setVrstaPrikljucka("strujni");
		
		//r.setNaziv(Pomocno.ucitajString("Unesi naziv proizvođača"));
		//r.setVrstaPrikljucka(Pomocno.ucitajString("Unesi vrstu daljinskog"));

	}

}
