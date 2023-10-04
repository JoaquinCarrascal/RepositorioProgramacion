package ejercicio05;

public class Principal {

	public static void main(String[] args) 
	{
		
		double cincuenta = 50;
		double unaGbp = 1;
		double gbpAEuro = 0.87;
		double calcGbp = 0;
		double euroGbp = 1.15;
		
		System.out.println("Hola buenas, en esta interfaz, mostraré"
				+ " el valor de la libra con respecto al euro y "
				+ "calculará cuántas libras son 50 euros.");
		
		System.out.println(" ");
		
		calcGbp = cincuenta * gbpAEuro;
		
		System.out.println("El euro tiene un coste actual de " + gbpAEuro + 
				" libras esterlinas (£).");
		
		System.out.println(unaGbp + " libra esterlina (£) tiene el valor de " + euroGbp
				+ " euros.");
		
		System.out.println("Por lo tanto " + cincuenta + " euros son " +
		calcGbp + " libras esterlinas (£).\n");
		
		System.out.println("Gracias por usar la interfaz :):");
	}

}
