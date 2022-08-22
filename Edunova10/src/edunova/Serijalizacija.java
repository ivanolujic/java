package edunova;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import edunova.model.Predavac;

public class Serijalizacija {
	
	//https://mkyong.com/java/how-to-read-and-write-java-object-to-a-file/

	
	public Serijalizacija() {
		Predavac p = new Predavac();
		p.setIme("Pero");
		
		try {
			FileOutputStream stream =
					new FileOutputStream(
							new File("datoteka.txt")
							);// javlja grešku jer traži da se ukljući u try catch
			ObjectOutputStream outputStream =
					new ObjectOutputStream(stream);
			
			outputStream.writeObject(p);
			outputStream.close();
			stream.close();
		
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args) {
		
	}


}
