package ejercicio08;

public class Principal {

	public static void main(String[] args) 
	{

		//variables
		float radCirculo = (float) 5.2;
		short radCircunfe = 3;
		float circunfe = 0;
		float circulo = 0;
		
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Hola buenas, este programa va a mostrar "
						 + "la longitud de una circunferencia con 3 metros \nde radio "
						 + "y el área de un círculo de radio 5,2 metros.");
		circunfe = (float) (Math.PI*radCircunfe);
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
		
		System.out.printf("\nLa longitud de la circunferencia será de: %.2f metros.",circunfe);
		
		circulo = (float)(Math.PI*Math.pow(radCirculo, 2));
		System.out.printf("\nEl área de un circulo de radio 5,2 metros"
				+ " es: %.2f metros cuadrados.\n",circulo);
		System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("       \t\t\tGracias por usar el programa :):");

	}

}
