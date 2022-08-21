package edunova;

import javax.swing.JOptionPane;

// program ispisuje unešeno ime

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		String ime; // deklariranje obavezno izvan petlje
		while (true) {
			ime = JOptionPane.showInputDialog("Unesi ime");
			
			if(ime.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
			} else {
				ime=ime.trim();
				break;
			}
			
		
			
		}
			
		System.out.println(ime);
		
	}

}
