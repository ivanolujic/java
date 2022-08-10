package edunova;

public class E02DoWhilePetlja {

	public static void main(String[] args) {
		
		// DO WHILE petlja osigurava minimalno jednu iteraciju petlje
		// uvjet izlaska iz petlje je na kraju naredbe
		
		int i=10;
		
		do { 
			System.out.println("Osijek");
		} while(i>10);// sa ovakvom postavom samo while naredbe, ne bi
		// ništa ispisalo, ali sa do while osigurana je barem jedna iteracija
		// bez obzira što stoji kao while uvjet (stoji 10, a može i 100)
		
		// sve ostalo što vrijedi za FOR i WHILE, vrijedi i za DO WHILE
		
		
		// beskonačni DO WHILE
		
		do {
			//break;
		} while(true);

	}

}
