package edunova;

public class E05Operatori {

	public static void main(String[] args) {
		
		//Čitati: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		
				int i=4,j=8;
				
				int z = i+j;
				System.out.println(z);
				System.out.println(i+j);
				
				z=i-j;
				z=i*j;
				z=i/j;
				System.out.println(z);
				
				float rez = i/j;
				System.out.println(rez);
				
				rez = (float)i/j;
				System.out.println(rez);
				
				// modulo
				// ostatak nakon cjelobrojnog djeljenja
				System.out.println(10/3);// ispisuje rezultat bez ostatka (3)
				System.out.println((float)10/3); // ispisuje kao decimalni broj
				
				System.out.println(10%3); // ispisuje ostatak nakon dijeljenja (1)

	}

}
