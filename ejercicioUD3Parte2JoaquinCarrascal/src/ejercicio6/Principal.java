package ejercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int casoMenu = 0, casoSalida = 0,filai,columnaj;
		Entrada e[][] = new Entrada[10][10];
		Sala s1 = new Sala(e ,1 , 100,"Piratas del Caribe");
		s1.rellenarSala(5);
		
		do {
			mostrarMenu();
			aux= sc.nextLine();
			casoMenu = Integer.parseInt(aux);
			switch(casoMenu) {
			case 1:
				s1.mostrarInformacionSala();
				break;
			case 2:
				System.out.println("Qué fila quieres");
				aux= sc.nextLine();
				filai = Integer.parseInt(aux);
				System.out.println("Qué asiento quieres");
				aux= sc.nextLine();
				columnaj = Integer.parseInt(aux);
				if(s1.comprarEntrada(filai,columnaj))
						System.out.println("Está ocupada ya.");
				else {
					System.out.printf("Ahora es tuya, serían: %.2f€.\n",e[filai][columnaj].getPrecio());
					if(e[filai][columnaj].isOcupacion())
						System.out.println("Good");
				}
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Número incorrecto, inténtelo de nuevo");
			}
		}while(casoMenu != casoSalida);

	}

	public static void mostrarMenu() {
		System.out.println("\n1.- Ver la cartelera\n"
						 + "2.- Comprar 1 entrada\n"
						 + "3.- Calcular ganancias totales\n"
						 + "4.- Comprar varias entradas\n"//+ 5 descuento
						 + "5.- Modificar el precio de una entrada");
	}
	
}
