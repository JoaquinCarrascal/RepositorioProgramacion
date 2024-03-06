package EjercicioExamenTipoA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Carta> listado = new ArrayList<>();
		Mazo mz = new Mazo (listado);
		String nuevoNombre,palo;
		int casoMenu = 0, casoSalida = 0,numCarta = 0;
		
		Carta c1 = new Carta("Huevo frito","Oro",1);
		Carta c2 = new Carta("La malilla","Bastos",2);
		Carta c3 = new Carta("La amiga de oros","Oro",10);
		Carta c4 = new Carta("Cuatro de copas","Copas",4);
		Carta c5 = new Carta("Tres de espadas","Espadas",3);
		Carta c6 = new Carta("Siete de oros","Oro",7);
		Carta c7 = new Carta("Rey de copas","Copas",12);
		Carta c8 = new Carta("Sota de bastos","Bastos",10);
		
		mz.agregarCarta(c1);
		mz.agregarCarta(c2);
		mz.agregarCarta(c3);
		mz.agregarCarta(c4);
		mz.agregarCarta(c5);
		mz.agregarCarta(c6);
		mz.agregarCarta(c7);
		mz.agregarCarta(c8);
		
		System.out.println("Bienvenido al programa de La Brisca");
		
		do {
			
			System.out.println("\n1.- Buscar una carta concreta.\n"
							 + "2.- Buscar cartas con valor 0.\n"
							 + "3.- Calcular puntuación total del mazo.\n"
							 + "4.- Modificar nombre de una carta.\n"
							 + "5.- Mostrar mazo.\n"
							 + "6.- Mostrar mazo ordenado por palo.(a-z)\n"
							 + "7.- Mostrar mazo ordenado por puntuacion.(max-min)\n"
							 + "0.- Salir\n");
			
			casoMenu = Integer.parseInt(sc.nextLine());
			
			switch(casoMenu) {
			
			case 1:
				System.out.println("Diga el palo de la carta:");
				palo = sc.nextLine();
				System.out.println("Diga el número de la carta:");
				numCarta = Integer.parseInt(sc.nextLine());
				System.out.println(mz.buscarCartaConcreta(numCarta, palo));
				break;
			
			case 2:
				System.out.println(mz.buscarValorCero());
				break;
			
			case 3:
				System.out.printf("La puntuación total es: %d puntos.",mz.calcularPuntTotal());
				break;
			
			case 4:
				System.out.println("Diga el palo de la carta que quiere modificar:");
				palo = sc.nextLine();
				System.out.println("Diga el número de la carta:");
				numCarta = Integer.parseInt(sc.nextLine());
				System.out.println("Diga el nuevo nombre:");
				nuevoNombre = sc.nextLine();
				mz.modificarNombre(numCarta, palo, nuevoNombre);
				break;
			
			case 5:
				mz.mostrarMazo();
				break;
			
			case 6:
				Collections.sort(listado);
				mz.mostrarMazo();
				break;
			
			case 7:
				Collections.sort(listado,new OrdenarPorPuntuacion());
				mz.mostrarMazo();
				break;
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Vaya parece que la opción no "
						+ "está comprendida, inténtelo de nuevo.");
			
			}
			
		}while(casoMenu != casoSalida);

		System.out.println("Gracias por usar el programa.");
		sc.close();
		
	}

}
