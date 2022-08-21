package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {

	// program učitava brojeve sve dok ne dođe
	// tekst "stop"
	// program ispisuje prosjek svih unešenih brojeva

	public static void main(String[] args) {
		
		String broj = ""; // string za unos brojava/slova zato što je prekid kod unešenog stop
		int x; // varijabla pojedinačno unešenog broja
		int suma = 0; // zbroj unešenih brojeva
		int countUnosa = 0;// brojač broja unešenih brojeva

		while (true) {
			try {
				broj = JOptionPane.showInputDialog("Unesi broj: ");

				x = Integer.parseInt(broj);// string podatak pretvaramo u integer

				suma += x;
				countUnosa++;

			} catch (Exception e) {

				if (broj.toLowerCase().trim().equals("stop")) {// toLowerCase sva unešena slova vraća na mala slova
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Obavezan unos ili stop za kraj");
				}

			}
		}
		System.out.println(suma / (double) countUnosa);

	}

}
