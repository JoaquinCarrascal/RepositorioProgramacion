package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner tecl = new Scanner(System.in);
		
		double km;
		
		double precioGas;		
		
		double litXKm;
		
		double gasto100;
		
		double gastoTot;
		
		double litrosVia = 0;
		
		int cien = 100;
		
		System.out.println("//Hola buenas consumidor, este programa sirve para calcular "
				+ "el coste de la gasolina de un viaje.//");
		
		System.out.print("Introduzca la distancia recorrida: ");
		km = tecl.nextDouble();
		
		System.out.print("\nAhora introduzca el precio del litro combustible acualmente: ");
		precioGas = tecl.nextDouble();
		
		System.out.print("\nIntroduzca aqui el gasto de su coche en litros cada 100km: ");
		gasto100 = tecl.nextDouble();
		
		litXKm = gasto100 / cien;
		litrosVia = litXKm * km;
		gastoTot = litrosVia * precioGas;
		
		
		System.out.printf("\nEl gasto de su coche en este determinado viaje será de aproximadamente: %.2f euros.",gastoTot);
		
		System.out.println("\n-------------------------------------------------------------------------------------");
		
		System.out.println("\n                      Gracias por usar este programa. :):");
		
	}
}


