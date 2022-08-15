package edunova;

public class Zadatak04 {
	
	// Za dva učitana broja ispiši manji
	
		public static void main(String[] args) {
			int a = Pomocno.ucitajInt("Prvi");
			int b = Pomocno.ucitajInt("Drugi");
			
			System.out.println(a>=b ? b:a);
			
			// da bi osigurali da se unosi pozitivan broj
			// koristimo drugu metodu, istog naziva, ali sa 
			// boolean parametrom koji provjerava da li je broj pozitivan
			
			a = Pomocno.ucitajInt("Prvi",true);
			b = Pomocno.ucitajInt("Drugi",true);
			
			System.out.println(a>=b ? b:a);
			
		}
}
