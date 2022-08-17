package basic_part1;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Write a Java program to divide two numbers and print on the screen

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println((float)prviBroj/drugiBroj);

	}

}
