package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		
		Scanner keyB = new Scanner(System.in);
		Cabecera cab;
		String nombreAs;
		String nombreAul;
		String fecha;
		
		System.out.println("Nombre asignatura: ");
		nombreAs = keyB.nextLine();
		System.out.println("Nombre aula: ");
		nombreAul = keyB.nextLine();
		System.out.println("fecha: ");
		fecha = keyB.nextLine();
		
		cab = new Cabecera(nombreAs,nombreAul,fecha);
		
		cab.impresionCabecera();
		
		keyB.close();
		

	}

}
