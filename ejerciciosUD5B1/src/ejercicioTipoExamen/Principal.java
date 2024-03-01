package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casoSalida = 0, casoMenu = 0, id = 6;
		String nombre,descripcion;
		
		Palabra p1 = new Palabra(1,"knowledge","conocimiento de una persona");
		Palabra p2 = new Palabra(2,"cofee","Grano seco triturado con el que se prepara una bebida");
		Palabra p3 = new Palabra(3,"boat","barco");
		Palabra p4 = new Palabra(4,"summer","verano");
		Palabra p5 = new Palabra(5,"boat","barquito velero");
		
		List <Palabra> listado = new ArrayList<>();
		
		Diccionario dc = new Diccionario(listado);
		
		dc.agregarPalabra(p1);
		dc.agregarPalabra(p2);
		dc.agregarPalabra(p3);
		dc.agregarPalabra(p4);
		dc.agregarPalabra(p5);

		dc.imprimirDescripcion(dc.buscarPorNombre("cofee"));
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("\n\n1.- Imprimir diccionario\n"
							 + "2.- Agregar palabra\n"
							 + "3.- Consultar descripcion\n"
							 + "4.- Modificar descripcion\n"
							 + "5.- Ordenar de manera inversa\n"
							 + "6.- Borrar palabra\n"
							 + "7.- Listado palabras iguales\n"
							 + "0.- Salir");
			
			casoMenu = Integer.parseInt(sc.nextLine());
			
			switch(casoMenu) {
			
			case 1:
				dc.imprimirDiccionario();
				break;
				
			case 2:
				System.out.println("Diga el nombre de la palabra");
				nombre = sc.nextLine();
				System.out.println("Diga la descripción");
				descripcion = sc.nextLine();
				dc.agregarPalabra(new Palabra(id++,nombre,descripcion));
				break;
				
			case 3:
				System.out.println("Diga el nombre de la palabra");
				dc.imprimirDescripcion(dc.buscarPorNombre(sc.nextLine()));
				break;
				
			case 4:
				System.out.println("Diga el nombre de la palabra");
				nombre = sc.nextLine();
				System.out.println("Diga la nueva descripción");
				dc.modificarDescripcion(nombre, sc.nextLine());
				break;
				
			case 5:
				Collections.sort(listado, new OrdenarInverso());
				break;
			
			case 6:
				System.out.println("Diga el nombre de la palabra");
				dc.borrarPalabra(sc.nextLine());
				break;
				
			case 7:
				System.out.println("Diga el nombre de la palabra");
				System.out.println(dc.listadoPalabra(sc.nextLine()));
				
				break;
				
				
			default: 
				System.out.println("Vaya, opción no reconocida, inténtelo de nuevo.");
			
			
			}
			
		}while(casoSalida != casoMenu);
		
		System.out.println("Thats all folks!");
		
		sc.close();
		
	}

}
