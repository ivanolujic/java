package edunova;

public class Zadatak03 {
	
	public static void main(String[] args) {
		
		//System.out.println(metoda("Mateja")); ovo ne radi zato što je main
		// metoda uvijek statična i može pozvati samo statične metode i zato
		// smo prethodno upisali static u metodu ispod
		
		System.out.println(metoda("Mateja"));
		
		
	}
	
	// kreirati privatnu metodu tipa int koja vraća sve 
	// pojavnosti slova "a" u primljenom stringu

	private static int metoda (String s) {
		int ukupno=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {// za tip char idu jednostruki navodnici
				ukupno++;
			}
		}
		
		
		return ukupno;
		
	}

}
