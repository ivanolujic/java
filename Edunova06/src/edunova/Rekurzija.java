package edunova;

public class Rekurzija {
	
	//rekurzija je metoda koja poziva samu sebe
		// uz obavezan uvjet prekida rekurzije
		// u protivnom imamo stack overflow
	
	// Rekurzija je zapravo petlja za koju ne znaš
	// koliko će se puta ponavljati
	// Zadatak koji se rješava rekurzijom je npr.
	// "Ljubavni kalkulator" - koliko % se vole dva imena

	public static void main(String[] args) {
		
		// metoda(); // ovako dobijemo stackoverflow exception
		System.out.println(zbroj(100));

	}
	
	//static void metoda() {
			//metoda(); // ovako dobijemo stackoverflow exception
		//}
		
	
	// slijedeća metoda prima broj i računa zbroj svih
	// brojeva od primljenog na niže (100+99+98....)
		static int zbroj(int broj) {
			if(broj==1) {
				return 1;
			}
			//System.out.println(broj);
			return broj+zbroj(broj-1);

}
}
