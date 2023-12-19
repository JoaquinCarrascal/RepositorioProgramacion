package examenCorredores;

import java.util.Scanner;

/*
 1. Desde que dejé de fumar me he enganchado a correr carreras populares y me han pedido en mi pueblo que haga un programa para 
	gestionar los corredores de esta carrera. Tendremos la clase Corredor, cuyas características son: 
	En la clase Carrera, tendremos como características una lista de Corredores y kilómetros de los que consta.
	En ambas calases tendremos los constructores, getters and setters y toString adecuados, además de los métodos propios (que irán todos 
	en la clase Carrera). Se debe crear una clase principal, con un menú donde se podrán hacer las siguientes cosas. El programa se repetirá 
	hasta que el usuario quiera. En cada caso del menú se deben mostrar las cosas pedidas, por ejemplo, si se pide buscar algo, debemos 
	mostrar en el main el resultado de esa búsqueda. También se pueden agregar varios corredores a la lista para hacer las pruebas antes 
	de empezar el menú.
 */

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux,nombre;
		int tam = 100,casoMenu = 0, casoSalida= 0,categoria;
		double tiempo;
		Corredor [] lista = new Corredor[tam];
		Carrera carr1 = new Carrera(lista);
		
		do {
			System.out.println("1.- Agregar corredor");
			aux = sc.nextLine();
			casoMenu = Integer.parseInt(aux);
			
			switch(casoMenu) {
			case 1:
				System.out.println("diga nombre");
				System.out.println("diga tiempo");
				System.out.println("diga categoria");
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida inténtelo de nuevo:");
			}
		}while(casoSalida!=casoMenu);
		
		sc.close();
	}

}
