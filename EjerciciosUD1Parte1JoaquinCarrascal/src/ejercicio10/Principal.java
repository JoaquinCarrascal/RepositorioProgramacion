package ejercicio10;

public class Principal {

	public static void main(String[] args) 
	{
		float producto = (float)12.99;
		int tres = 3;
		int cien = 100;
		int cuatro = 4;
		double totalProd = 0;
		double totalDesc = 0;
		
		System.out.print("---------------------------------------------------------------------------------\n");
		System.out.print("Buenos días consumidor, esta interfaz muestra el precio final de su producto.\n");
		System.out.println("---------------------------------------------------------------------------------");
		
		totalProd = (float)producto * cuatro;
		System.out.printf("\nHa comprado usted 4 unidades de separadores de pelo, a un precio de: %.2f euros.\n",totalProd);
		
		totalDesc = totalProd-(totalProd * tres / cien);
		System.out.printf("Pero con el descuento de la casa se le queda en %.2f euros.\n",totalDesc);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("                     Gracias por usar la interfaz :):");
		
	}

}
