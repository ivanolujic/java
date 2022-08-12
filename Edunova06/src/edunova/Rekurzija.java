package edunova;

public class Rekurzija {
	
	//rekurzija je metoda koja poziva samu sebe
		// uz obavezan uvjet prekida rekurzije
		// u protivnom imamo stack overflow

	public static void main(String[] args) {
		
		// metoda();
		System.out.println(zbroj(100));

	}
	
	//static void metoda() {
			//metoda();
		//}
		
		static int zbroj(int broj) {
			if(broj==1) {
				return 1;
			}
			//System.out.println(broj);
			return broj+zbroj(broj-1);

}
}
