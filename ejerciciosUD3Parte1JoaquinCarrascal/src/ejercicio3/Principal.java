package ejercicio3;

import java.util.Scanner;

public class Principal {
	
	/*3. Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le
	pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o impar. 
	La clase no debe tener ningún atributo. Se deben probar los métodos en el main.*/

	public static void main(String[] args) 
	{

		Scanner keyB = new Scanner(System.in);
		Operacion op = new Operacion();
		String aux;
		double numInput;
		
		System.out.println("Diga un número: ");
		aux = keyB.nextLine();
		numInput = Double.parseDouble(aux);
		
		if(op.comparador(numInput)==true)
			System.out.print("Es positivo");
		else
			System.out.print("Es negativo");
		
		if(op.parimpar(numInput)==true)
			System.out.println(" y además par.");
		else
			System.out.println(" y además impar.");
	
		keyB.close();
	}

}
