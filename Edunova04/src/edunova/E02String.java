package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class E02String {

	public static void main(String[] args) {
		
		String s = JOptionPane
					.showInputDialog("Unesi svoje ime");
		
		System.out.println(s.charAt(0)); // ispisuje prvo slovo imena
		System.out.println(s.charAt(s.length()-1));// ispisuje zadnje slovo imena
		System.out.println();
		
		// deklaracija i konstruiranje nove instance
		// klase String pod imenom varijable "ime"
		
		String ime = new String(); // konstrukcija ide sa (), a ne sa [
		
		// skraćena sintaksa
		String grad="Osijek";
		
		System.out.println(grad.hashCode());
		
		System.out.println(grad.hashCode());
		
		grad = "Donji Miholjac";
		
		System.out.println(grad.hashCode());
		
		
		String[] parametri = new String[12]; // mora se upisati broj članova niza (12)
		
		parametri[0]="Edunova";
		parametri[1]= new String("Osijek");
		parametri[2]="Vukovar";
		
		System.out.println(Arrays.toString(parametri)); // ispisuje sve članove niza
		
		System.out.println(parametri[1].charAt(0));//ispisuje prvo slovo od "Osijek"
		
		
		

	}

}
