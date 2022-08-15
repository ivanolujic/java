package edunova;

public class Metode {
	
	//JOŠ uvijek ćemo se zadržati na 
	//static - nim metodama
	
	// main je metoda
	public static void main(String[] args) {
		ime();
		ime();
		int i=broj();// ovo je način ako u metodi "broj" nismo...
		System.out.println(i);//...unijeli sysout
		System.out.println(broj());// ili može i izravno
		int broj1=4;
		int broj2=3;
		zbroj(broj1, broj2);// ili
		zbroj(3,9);
		
		int[] nn = {2,3,4};// priprema niza za korištenje metode "suma"
		System.out.println(suma(nn));// korištenje metode "suma" sa podacima niza "nn"
		
		// POZIVANJE metode iz DRUGE KLASE istog paketa
		// pozivamo metodu koja traži najmanji broj iz
		// klase Zadatak01, sa podacima iz niza "nn" (gore)
		System.out.println(Zadatak01.najmanji(nn));
	}
	
	// kreiranje metode
	static void ime() { // procedura
		// funkcija je nešto što ti vraća vrijednost nazad
		// procedura ne vraća nikakav rezultat
		// u JAVI su sve metode i ona ne razlikuje funkcije i procedure
		// kada je metoda void, ona ne vraća vrijednost (procedura)
		System.out.println("Osijek");
		System.out.println("Edunova");	
	}
	
	static int broj() { // funkcija
		return (int)(Math.random()*100);
	}
	
	static void zbroj(int i,int j) {// ova metoda prima dva parametra tipa integer
		System.out.println(i+j);
		
	}
	
	static int suma(int[] niz) {// mogu biti i nizovi
		int s=0;
		for(int i:niz) { //zbraja sve elemente niza, bez obzira na dužinu niza
			s+=i;
		}
		
		return s;
		
	}
	
	// potpis metode:
	// tip podatka + naziv + lista parametara
	static int suma(int a, int b) {
		return a+b;
	}

	// sada u istoj klasi imamo dvije metode sa istim imenom "suma",
	// ali nemaju iste parametre (jedna prima dva intiđera, a druga niz)
	// i to je dozvoljeno
	// prilikom pozivanja metode ponuditi će nam se obje, ali
	// sa različitim parametrima
}
