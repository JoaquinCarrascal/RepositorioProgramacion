package ejercicio10;

import java.util.Random;
import java.util.Scanner;

/*10. Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un
	programa que simule una máquina vendedora de tickets de metro. Tendremos que crear la clase Ticket
	(Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal
	de prueba. Tendrá un menú donde se pueda:
	• Comprar uno o varios billetes.
	• Calcular el cambio a devolver.
	• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el
	mensaje “válido para x personas”.
	• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible
	un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es necesario
	usar fechas) y otro método que pueda poner a cero el contador de saldo total.
	• Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de
	los billetes ya que estos suelen subir todos los años.
	• Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
	cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.*/

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
				precBilltot = mq.calcPrecioBilletes(numBilletes, t1.getPrecioUnit());
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
