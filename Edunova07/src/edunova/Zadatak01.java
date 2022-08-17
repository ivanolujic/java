package edunova;

public class Zadatak01 {
	
	//Kreirati program koji prvo traži
		//broj predmeta. Zatim za svaki predmet 
		// unosi naziv i zaključenu ocjenu
		// program ispisuje popis svih predmeta s
		// ocjenama i prosjek ocjena

	public static void main(String[] args) {
		
		// stvaramo niz predmeta, koji će imati i ocjene
		// prije toga radimo klasu koja se zove predmet
		
		Predmet[] predmeti = new Predmet [Pomocno
		                                  .ucitajInt("Unesi broj predmeta")];
		
		Predmet predmet;
		Profesor profesor; //mora se deklarirati, inače javlja grešku
		for(int i=0;i<predmeti.length;i++) {
			predmet = new Predmet();
			predmet.setNaziv(Pomocno
					.ucitajString("Unesi naziv za "+(i+1)+". predmet"));
			
			// OVO NE RADITI - NULL POINTER EXCEPTION
			//predmet.getProfesor().setIme("Pero");
			
			profesor = new Profesor();
			predmet.getProfesor().setIme(Pomocno
					.ucitajString("Unesi ime za "+(i+1)+". profesora"));
			predmet.getProfesor().setPrezime(Pomocno
					.ucitajString("Unesi prezime za "+(i+1)+". profesora"));
			
			predmet.setProfesor(profesor);
			
			predmet.setOcjena(Pomocno
					.ucitajInt("Unesi ocjenu za"+(i+1)+" predmet", false));
			predmeti[i]=predmet;
		}
		
		int suma=0;
		for(Predmet p:predmeti) {
			suma+=p.getOcjena();
			System.out.println(
					p.getProfesor().getIme()+ " "+// sa getom se spuštaš od početka do zadnjeg što želiš ispisati
					p.getProfesor().getPrezime()+", "+ // ne može samo get.Prezime, već prvo get.Profesor
					p.getNaziv()+": "+ 
					p.getOcjena());
		}
		float prosjek = suma/(float)predmeti.length;
		System.out.println("-------------------------");
		System.out.println("Prosjek ocjena je:"+prosjek);
		
		
		
}
}