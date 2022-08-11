package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	
	//program prima dva cijela broja
	// ispisuje sve prim brojeve izmeðu
	// dva primljena broja

	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int manji, veci;
		if (prviBroj>drugiBroj) {
			veci=prviBroj;
			manji=drugiBroj;
		} else {
			veci=drugiBroj;
			manji=prviBroj;
		}
		
		for (int i=manji+1;i<veci;i++) {
			if (i%2==0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
		

	}

}
