package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
		// za upisani cijeli broj
		// ispiši zbroj zvih znamenki
		
		// ulaz: 263736
		// izlaz: 27
		
		// ulaz: 26
		// izlaz: 8
	
	public static void main(String[] args) {
		
		int broj = Integer.parseInt(JOptionPane.
				showInputDialog("Unesi cijeli broj"));
		
		int suma=0;
		
		while(broj>0) {
			//System.out.println(broj%10);
	    	suma+=broj%10;
	    	broj/=10;
	    	//System.out.println(broj);
	    	
	    }
		System.out.println("--------------");
		System.out.println(suma);
		
		
		
	}

}
