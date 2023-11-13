package ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner keyB = new Scanner(System.in);
		String aux,copia;
		int numVeces;
		Copiado c = new Copiado();
		
		System.out.println("Diga lo que quiere copiar: ");
		copia = keyB.nextLine();
		System.out.println("Diga cuántas veces lo quiere copiar.");
		aux = keyB.nextLine();
		numVeces = Integer.parseInt(aux);
		
		c.copiarNumVeces(copia, numVeces);
		
		keyB.close();
		
	}

}
