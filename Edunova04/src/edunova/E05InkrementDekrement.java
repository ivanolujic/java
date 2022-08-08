package edunova;

public class E05InkrementDekrement {

	public static void main(String[] args) {
		
		int i=1;
		// potrebno zapamtiti da je red upisivanja bitan i prema njemu se
		// izvršavaju naredbe
		System.out.println(i++);// ispisuje 1 - zato što se kod ispisa varijabla prvo koristi, a onda uvećava
		System.out.println(i); // sada ispisuje 2, sukladno prethodnom inkrementu
		System.out.println(++i); // sada prvo uveća (+ ispred i), a onda ispisuje varijablu ispisuje 3
		
		System.out.println(i--);// ispisuje 3 pa umanjuje za 1 (i=2)
		System.out.println(--i);// prvo umanjuje za 1, pa ispisuje vrijednost (1)
		
		int t=2,k=7;
		
		t += ++t -k--; // 3-7 = -4, t=-2, k=6 
		System.out.println("t="+t+"  k="+k);
		k=t++; // 6=(-2+1), k=-2 (odnosno t), a t=-2+1, što je -1
		System.out.println("t="+t+"  k="+k);
		
		System.out.println(k+t);

	}

}
