package ejercicio12;

public class Principal {

	public static void main(String[] args) 
	{
	
		float cocaCol = (float)1.20;
		float pipas = (float)0.40;
		int espada = 150;
		double precTot = 0;
		int pagado = 200;
		double devuelto;
		
		System.out.println("\t\t\t_.IchirakuShop._\t\t\t          \n"
						 + "-----------------------------------------------------------------\n"
						 + "C/JustoEnElCentro de AquiMismo.\n"
						 + "Le atendió John Snow ID:(#6457)\n"
						 + "Para mas información registrese en nuestra Web: www.IchirakuS.com\n"
						 + "-----------------------------------------------------------------\n"
						 + "Artref:.              precio unitario // cantidad // coste total.\n\n"
						 + "23 Cocacola 'lata 33cl'    "+cocaCol+"€.\t 2uds.\t\t"+(cocaCol+=cocaCol)+"€\n\n"
						 + "97 Pipas Elefante rosa     "+pipas+"€.\t 1ud.\t\t"+pipas+"€\n\n"
						 + "41100 Espada 'Garra'       "+espada+"€.\t 1ud.\t\t"+espada+"€\n\n"
						 + "-----------------------------------------------------------------\n");
						 precTot = cocaCol + pipas + espada;
						 devuelto = pagado - precTot;
						 
		 System.out.printf("TOTAL de la compra:        \t\t\t%.2f€\n"
		 				 + "Pagado:                    \t\t\t%d€\n"
		 				 + "Devuelto                   \t\t\t%.2f€\n",precTot,pagado,devuelto);
		 System.out.println("-----------------------------------------------------------------\n"
		 				  + "                 GRACIAS POR SU COMPRA :):\n\n"
		 				  + "Cambios y devoluciones hasta 15 días.\n"
		 				  + "Recuerde dejar una valoración en \n"
		 				  + "nuestra página Web: www.IchirakuS.com\n"
		 				  + "para un descuento del 20% en su próxima compra.\n\n"
		 				  + "¡Hasta pronto!");
		 				
	}

}
