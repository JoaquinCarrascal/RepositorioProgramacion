package ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner keyB = new Scanner(System.in);
		String aux;
		String nombre;
		int edad;
		double notaMedia;
		Alumno a1;
		String calle = "Jarcha";
		
		//instanciamos un objeto con valores
		System.out.println("Diga nombre: ");
		nombre = keyB.nextLine();
		
		System.out.println("Diga edad:");
		aux = keyB.nextLine();
		edad = Integer.parseInt(aux);
		
		System.out.println("Diga nota media:");
		aux = keyB.nextLine();
		notaMedia = Double.parseDouble(aux);
		
		a1 = new Alumno(nombre, edad, notaMedia);
		
		a1.mostrarDatos(calle);
		
		
		
		keyB.close();
	}

}
