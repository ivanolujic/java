package edunova;

public class Start {
	
	public Start() { //ovo je novi način na koji ćemo od sada raditi za Start klasu
		// kod formiranja se unese public Star(ctrl+space) i odaberemo 
		// Start metodu constructor
	}
	
	// nakon toga otvaramo main metodu u kojoj ćemo pozvati metodu Start
	
	public static void main(String[] args) {
		new Start();
		
		// to radimo zato što statične metode mogu pozivati samo statične metode
		// a na ovaj način u metodi Start (koja nije static) mogu pozivati i
		// statične i nestatične metode
	}

}
