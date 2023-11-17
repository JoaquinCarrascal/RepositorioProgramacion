package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner teclado = new Scanner(System.in);
		
		int veinte = 20;
		
		int cien = 100;
		
		double precioProduc;
		
		double descuen20;
		
		double  precFinal;
		
		char porcent = '%';
		
		char punto = '.';
		
		System.out.println("El siguiente programa sirve para aplicar un \ndescuento "
				+ "del 20% al producto que se desee.");
		
		System.out.println("\nIntroduzca el precio del producto: ");
		
		precioProduc = teclado.nextDouble();
		
		descuen20 = precioProduc * veinte / cien;
		
		precFinal = precioProduc - descuen20;
		
		System.out.printf("Su producto costará %.2f euros con el descuento del 20%c%c\n",
				precFinal,porcent,punto);
		System.out.println("\nGracias por usar el programa :):");
		teclado.close();
	}

}