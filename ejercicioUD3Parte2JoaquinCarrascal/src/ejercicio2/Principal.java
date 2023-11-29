package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String aux, nombreHot = "Hotel Portocolom JS Suites",nombreHab ;
		int tam = 100, casoMenu = 0, casoSalida = 0,limpieza,varone=1,idHab,
				numDias,extrasInt;
		double precioHab;
		boolean limpioBool,extras;
		Habitacion [] lista = new Habitacion[tam];
		Hotel h = new Hotel(lista, nombreHot);
		Habitacion hab;
		Habitacion hab1 = new Habitacion("Suite", 100 ,true);
		Habitacion hab2 = new Habitacion("Común", 80 ,false);
		h.agregarHabitacion(hab1);
		h.agregarHabitacion(hab2);
		
		System.out.println("Bienvenido a Hotel Portocolom JS Suites.");
		do {
			
			switch(casoMenu) {
			case 1:
				System.out.println("Agregar una habitacion");
				System.out.println("¿Qué tipo de habitación es?");
				nombreHab = sc.nextLine();
				System.out.println("¿Qué precio tiene?");
				aux = sc.nextLine();
				precioHab = Double.parseDouble(aux);
				System.out.println("¿Está limpia?(1 para si, cualquier número menos 1 para no)");
				aux = sc.nextLine();
				limpieza = Integer.parseInt(aux);
				if(limpieza == varone)
					limpioBool=true;
				else
					limpioBool=false;
				hab = new Habitacion(nombreHab,precioHab,limpioBool);
				h.agregarHabitacion(hab);
				break;
			case 2:
				System.out.println("Comprobar ocupacion:");
				System.out.println("Introduzca id de la habitación");
				aux = sc.nextLine();
				idHab = Integer.parseInt(aux);
				if(h.comprobarOcupacion(idHab))
					System.out.println("Está ocupada");
				else
					System.out.println("Está vacía");
				break;
			case 3:
				System.out.println("Calcular el precio final de una habitacion");
				System.out.println("Introduzca id de la habitación");
				aux = sc.nextLine();
				idHab = Integer.parseInt(aux);
				System.out.println("Introduzca cuantos días quiere estar");
				aux = sc.nextLine();
				numDias = Integer.parseInt(aux);
				System.out.println("Con extras o sin extras");
				aux = sc.nextLine();
				extrasInt = Integer.parseInt(aux);
				if(extrasInt == varone)
					extras=true;
				else
					extras=false;
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(casoMenu != casoSalida);
		sc.close();
	}

	
	public static void mostrarMenu() {
		System.out.println("\n1.- Agregar una habitación\n"
						 + "2.- Ver si una habitacion está ocupada\n");
	}
}
