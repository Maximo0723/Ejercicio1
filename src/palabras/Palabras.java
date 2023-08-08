package palabras;

import java.io.FileWriter;
import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		String palabras;
		Scanner scanner= new Scanner(System.in);
		String nombrearchivo= "C:\\Users\\Administrator\\Documents\\palabras.txt";
		try {
			FileWriter manejador= new FileWriter(nombrearchivo);
			for(int i=0; i<5; i++){
				System.out.println("Escribe la palabra numero " + i);
				palabras = scanner.nextLine();
				manejador.write(palabras + "\n");
			}
			manejador.close();
		} catch(Exception e) {
			
		}
	}

}
