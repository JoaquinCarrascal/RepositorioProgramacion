package ejemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		
		Scanner keyB = new Scanner(System.in);
		Alumno a1;
		String aux, nombre;
		double notaPro,notaBD;
		
		System.out.println("Introduzca su nombre: ");
		nombre = keyB.nextLine();
		System.out.println("Introduzca nota de programación: ");
		aux = keyB.nextLine();
		notaPro = Double.parseDouble(aux);
		System.out.println("Introduzca nota de Bases de datos: ");
		aux = keyB.nextLine();
		notaBD = Double.parseDouble(aux);
		
		a1 = new Alumno(nombre,notaPro,notaBD);
		a1.mostrarMedia(a1.calcularMedia());
		
		keyB.close();

	}

}
