package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Predavac;

public class Lista {
	
	public Lista() {
		
		// sintaksa do jave 1.5 i nećemo ju koristiti
		//List lista = new ArrayList();
		//lista.add("Osijek");
		//lista.add(new Predavac())
		
		
		// s lijeve strane znaka jednakosti sučelje
		// a s desne implementacijska klasa
		
		List<Predavac> lista = new ArrayList<Predavac>();
		// rezervira niz od 10 elemenata, a kada se popuni
		// povečava se broj elemenata za 10%
		
		Predavac p=new Predavac();
		p.setIme("Pero");
		lista.add(p);
		
		System.out.println(lista.get(0).getIme());
		lista.add(new Predavac());
	}
	
	
	
	public static void main(String[] args) {
		new Lista();
		
	}

}
