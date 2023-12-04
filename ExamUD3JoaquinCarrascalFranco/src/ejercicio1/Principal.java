package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int casoMenu = 0, casoSalida = 0, tam = 100, estado = 0, m2 = 0, numPiso = 0, varcero = 0, numVendedores = 0,
				vartope = 4;
		double precio, porcentGanan, precNuevo = 0;
		Piso[] p = new Piso[tam];
		Inmobiliaria inmo = new Inmobiliaria(p);
		Piso p1 = new Piso(200, 1, 30000);
		Piso p2 = new Piso(190, 2, 25000);
		Piso p3 = new Piso(230, 3, 15000);
		Piso p4 = new Piso(150, 3, 18000);
		Piso p5 = new Piso(120, 1, 24000);
		inmo.agregarPiso(p1);
		inmo.agregarPiso(p2);
		inmo.agregarPiso(p3);
		inmo.agregarPiso(p4);
		inmo.agregarPiso(p5);

		System.out.println("Bienvenido a la inmobiliaria Copinsa");

		do {
			imprimirMenu();
			aux = sc.nextLine();
			casoMenu = Integer.parseInt(aux);
			switch (casoMenu) {
			case 1:
				System.out.println("¿Cuántos metros cuadrados tiene su piso?");
				aux = sc.nextLine();
				m2 = Integer.parseInt(aux);
				do {
					System.out.println("Diga estado de la vivienda: 1 nuevo, 2 seminuevo, 3 a reformar");
					aux = sc.nextLine();
					estado = Integer.parseInt(aux);
					if (estado > vartope || estado < casoSalida)
						System.out.println(
								"Parece que has introducido un número no comprendido en el sistema, inténtalo de nuevo.");
				} while (estado > vartope || estado < casoSalida);
				System.out.println("¿Qué precio le quiere colocar?");
				aux = sc.nextLine();
				precio = Double.parseDouble(aux);
				inmo.agregarPiso(new Piso(m2, estado, precio));
				System.out.println("Este sería su:" + p[inmo.getNumPisos() - 1]);
				break;
			case 2:
				do {
					System.out.println("Diga la dirección del piso que quiere calcular:");
					aux = sc.nextLine();
					numPiso = Integer.parseInt(aux);
					if (numPiso > inmo.getNumPisos())
						System.out.println("No hay pisos registrado ahí inténtelo de nuevo:");
				} while (numPiso > inmo.getNumPisos());
				System.out.println("¿Que porcentaje del precio del piso quieres ganar sobre el precio del piso?");
				aux = sc.nextLine();
				porcentGanan = Double.parseDouble(aux);
				System.out.printf("El precio final de este piso será de %.2f€",
						inmo.calcularPrecioFinalVenta(porcentGanan, numPiso));
				break;
			case 3:
				System.out.println("Estos son los pisos nuevos que tenemos registrados: ");
				inmo.mostrarPisosNuevos();
				break;
			case 4:
				System.out.println("Diga la dirección del piso que quiere calcular: ");
				aux = sc.nextLine();
				numPiso = Integer.parseInt(aux);
				System.out.println("Diga cantidad nueva para el piso: ");
				aux = sc.nextLine();
				precNuevo = Double.parseDouble(aux);
				if (inmo.cambiarPrecioPiso(numPiso, precNuevo))
					System.out.println("Precio modificado con éxito.");
				else
					System.out.println("Algo ha ido mal, inténtelo de nuevo.");
				break;
			case 5:
				System.out.println("Diga la dirección del piso que quiere calcular: ");
				aux = sc.nextLine();
				numPiso = Integer.parseInt(aux);
				if (numPiso < inmo.getNumPisos()) {
					do {
						if (p[numPiso].getpVP() == varcero) {
							System.out.println(
									"Introduzca porfavor el porcentaje de ganancia que quiere tener con el piso:");
							aux = sc.nextLine();
							porcentGanan = Double.parseDouble(aux);
							System.out.printf("El precio final de este piso será de %.2f€\n\n",
									inmo.calcularPrecioFinalVenta(porcentGanan, numPiso));
						}
					} while (p[numPiso].getpVP() == 0);
					System.out.printf("El precio del metro cuadrado en este piso es de: %.2f€.",
							inmo.calcularPrecioM2(numPiso));
				} else
					System.out.println("No hay pisos registrados con esa direccion, inténtelo de nuevo.");
				break;
			case 6:
				System.out.println(
						"Introduzca porfavor el porcentaje de ganancia que quiere tener con los pisos que no tienen el PvP calculado.");
				aux = sc.nextLine();
				porcentGanan = Double.parseDouble(aux);
				System.out.printf("La venta total de los seminuevos daría: %.2f€.",
						inmo.ventaTotalSeminuevos(porcentGanan));
				break;
			case 7:
				System.out.println("¿Cuántos vendedores tiene su empresa?");
				aux = sc.nextLine();
				numVendedores = Integer.parseInt(aux);
				inmo.setNumVendedores(numVendedores);
				System.out.println("¿Con qué porcentaje de ganancias querría calcular los pisos?");
				aux = sc.nextLine();
				porcentGanan = Double.parseDouble(aux);
				System.out.printf("Cada vendedor ganaría: %.2f€.", inmo.calcularGananxVendedor(porcentGanan));
				break;
			case 8:
				System.out.println("Éstos son todos los pisos de la inmobiliaria:");
				inmo.listarTodos();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println(
						"Vaya parece que la opción introducida no esta comprendida en esta aplicación, inténtelo de nuevo:");
			}

		} while (casoMenu != casoSalida);

		System.out.println("Gracias por usar la aplicación.");

		sc.close();
	}

	public static void imprimirMenu() {
		System.out.println("\nMenú:\n" + "1.- Agregar un piso.\n" + "2.- Calcular el precio final de un piso.\n"
				+ "3.- Consultar pisos nuevos.\n" + "4.- Cambiar el precio de un piso.\n"
				+ "5.- Calcular el precio por metro cuadrado de un piso.\n"
				+ "6.- Calcular venta total de seminuevos.\n" + "7.- Calcular cuanto ganará cada vendedor.\n"
				+ "8.- Listar todos los pisos de la inmobiliaria.");
	}

}
