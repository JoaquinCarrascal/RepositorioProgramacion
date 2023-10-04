package ejercicio11;

public class Principal {

	public static void main(String[] args) 
	{
		char uniCo = '\u00f8';
		
		byte litroXSeg = 8;
		int segXDia = 86400;
		int litX24 = 0;
		int metCub = 1000;
		double totalMetCub = 0;
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.printf("                 %c PROGRAMA INFORMATIVO DEL GOBIERNO CON MOTIVO CRISIS EN LAS AGUAS %c",uniCo,uniCo);
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Con motivo de la sequía que ha azotado esta nuestra comunidad la junta de\n"
						 + "gobierno ha tomado la siguiente medida:\n"
						 + "Apertura inmediata de todos los pozos de la región, para la recirculación de las aguas.\n"
						 + "A continuación se dejará el computo de agua extraída en las últimas 24 hrs.\n"
						 + "Gracias por su cooperción.");
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		litX24 = litroXSeg * segXDia;
		totalMetCub = litX24 / metCub;
		
		System.out.printf("Actualmente se están extrayendo %d litros por segundo, lo que atendería a un total de %d L en 24hrs.\n"
						+ "Expresado en métros cúbicos: %.1f m³.",litroXSeg,litX24,totalMetCub);
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		System.out.println("                  Gracias por ver este informativo y rogamos calma en la población. :):");
		
	}

}
