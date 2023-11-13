package ejercicio6;

import java.util.Scanner;

public class Principal {

	/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente
	distintos números o resultados según las características del sorteo o para qué se vaya a usar, por ejemplo,
	generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar
	a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos
	los métodos pidiendo los datos necesarios para cada generación.*/
	public static void main(String[] args) 
	{

		Scanner tcl = new Scanner(System.in);
		Generadora gen = new Generadora();
		String aux,
			menMsg1 = "Jugar a la primitiva.",
			menMsg2 = "Jugar a pares y nones.";
		int casoSalida = 0,numUsuMenu, numTopePrimitiva=6,desde,hasta,menuParesNones=0,numUsu = 0;
		
		System.out.println("Bienvenido al programa de juegos.");
		System.out.println("---------------------------------");
		
		do {
			
			System.out.printf("1.- %s\n"
					 		+ "2.- %s\n"
					 		+ "",menMsg1,menMsg2);
	
			aux = tcl.nextLine();
			numUsuMenu = Integer.parseInt(aux);
					
			switch(numUsuMenu) {
			case 1:
				System.out.println(menMsg1);
				
				System.out.println("¿Desde qué número quiere empezar el sorteo?");
				aux = tcl.nextLine();
				desde = Integer.parseInt(aux);
				System.out.println("¿Hasta qué número quiere que llegue el sorteo?");
				aux = tcl.nextLine();
				hasta = Integer.parseInt(aux);
				
				System.out.println("Éstos son sus números:");
				
				for(int i = 0;i<numTopePrimitiva;i++) {
					System.out.print(" " + gen.generarPrimitiva(desde, hasta));
				}
				
				System.out.println("\n");
				break;
				
			case 2:
				do {
					System.out.println(menMsg2);
					System.out.println("Elija pares o nones:\n"
									 + "1.- Pares.\n"
									 + "2.- Nones.\n"
									 + "0.- Salir.\n");
					aux = tcl.nextLine();
					menuParesNones = Integer.parseInt(aux);
					switch(menuParesNones) {
					case 1:
						if(gen.generarParesYNones(numUsu) == true)
							System.out.println("¡Ganaste!");
						else
							System.out.println("¡Perdiste!");
						
						break;
						
					case 2:
						break;
						
					case 0:
						System.out.println("Saliendo...");
						break;
						
						default:
							System.out.println("¡Vaya!, parece que el número introducido no corresponde con ninguna opción, inténtelo de nuevo.");
					}
				}while(menuParesNones != casoSalida);
				break;
			}
			
		}while(numUsuMenu != casoSalida);
		
		System.out.println("Gracias por usar el programa. :):");
		tcl.close();

	}

}
