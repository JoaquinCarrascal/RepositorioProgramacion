package ejercicio02;

public class Principal {

	public static void main(String[] args) 
	
	{
		
	//Variables
		double precioM3 = 1.80;
		double pOlLarg = 50, pisOAnch = 21, pisOProf = 2.5, volPO = 0;
		double pCProf = 1.80, pCRad = 12, volPC= 0, exp = 2;
		double costeCirc = 0;
	//Math.PI == pi (3,14)
		
		System.out.println("Buenas, este programa mostrará "
			+ "el volumen de 2 piscinas y ademas el coste de llenado.");
	
		volPO = pOlLarg * pisOAnch * pisOProf;
		volPC = Math.PI * Math.pow(pCRad, exp) * pCProf;
		costeCirc = volPC * precioM3;
	
		System.out.println(" ");
		
		System.out.println("Volumen de nuestra piscina olímpica: " 
		+ volPO + " metros cúbicos," + " costará llenarla: " + volPO * precioM3 + " euros.");
		
		//System.out.println("Volumen de nuestra piscina circular: " + Math.round(volpc)
		//+ " metros cúbicos," + " costará llenarla: " + Math.round(volpc) * preciom3 + " euros.");
		
		System.out.printf("Volumen de nuestra piscina circular: %.2f métros cúbicos, "
				+ "costará llenarla: %.2f euros.\n",volPC,costeCirc);
		
		System.out.println("\nGracias por usar el programa :):");
	
	
	}

}
