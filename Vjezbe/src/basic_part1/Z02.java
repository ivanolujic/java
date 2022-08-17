package basic_part1;

import javax.swing.JOptionPane;

public class Z02 {
	
	//Write a Java program to print the sum of two numbers.

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		System.out.println(prviBroj+drugiBroj);
		

	}

}
