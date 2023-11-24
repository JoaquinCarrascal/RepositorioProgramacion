package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner keyB = new Scanner(System.in);
		int casoMenu = 0, casoSalida = 0, numBilletes, casoSalidaEsp, varUno = 1;
		Double dineroIntrod, precBilltot;
		String aux;
		Random rnd = new Random(System.nanoTime());
		Ticket t1 = new Ticket(1, (rnd.nextDouble(3 - 1.5) + 1.5));
		Maquina mq = new Maquina();

		System.out.println("Bienvenido a la terminal de Renfe.");
		do {
			Principal.mostrarMenu();
			aux = keyB.nextLine();
			casoMenu = Integer.parseInt(aux);

			switch (casoMenu) {
			case 1:
				System.out.printf("El precio actual es de: %.2f €", t1.getPrecioUnit());
				break;
			case 2:
				casoSalidaEsp = 0;
				System.out.println("¿Cuántos billetes desearía comprar?");
				aux = keyB.nextLine();
				numBilletes = Integer.parseInt(aux);
				precBilltot = t1.calcPrecioBilletes(numBilletes);
				System.out.printf("Serían: %.2f €", precBilltot);
				do {
					System.out.println("Inserte el dinero en la ranura lateral:");
					aux = keyB.nextLine();
					dineroIntrod = Double.parseDouble(aux);
					if (dineroIntrod > precBilltot) {
						System.out.printf("Su vuelta es: %.2f", mq.calcularVuelta(dineroIntrod, precBilltot));
						casoSalidaEsp = varUno;
					} else
						System.out.println(
								"El dinero introducido parece ser inferior al dinero necesario, inténtelo de nuevo.");
				} while (casoSalidaEsp != casoSalida);
				break;
			}

		} while (casoMenu != casoSalida);

		keyB.close();
	}

	public static void mostrarMenu() {
		System.out.println("\n1.- Consultar el precio de un billete.\n" + "2.- Comprar billetes.\n"
				+ "3.- Opciones de operario\n" + "0.- Salir de la terminal.");
	}

}
