package ejercicio1B;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casoMenu = 0, casoSalida = 0;
		Caja c = new Caja(2200);//total de la caja metido a casca-porra para hacer la comprobacion
								//con el que esta introducido por teclado.
		String codTrabajador = "0";
		boolean salir = true;

		do {

			try {

				System.out.println("Iniciar sesión(Pulse 0 para salir)");
				codTrabajador = sc.nextLine();
				if (c.iniciarSesion(codTrabajador)) {
					do {
						System.out
								.println("\n1.- Hacer caja\n" + "2.- Verificar operaciones diarias\n" + "0.- Salir\n");
						casoMenu = Integer.parseInt(sc.nextLine());
						switch (casoMenu) {

						case 1:
							System.out.println("Introduza el recaudado total:");

							if (c.hacerCaja(Integer.parseInt(sc.nextLine()))) {
								System.out.println("Operación realizada con éxito");
							}

							break;
						case 2:

							System.out.println("Diga el número de operaciones:");
							if (c.comprobarOperaciones(Integer.parseInt(sc.nextLine())))
								System.out.println("Comprobación exitosa");

							break;
						case 0:
							salir = true;
							break;

						}

					} while (casoMenu != casoSalida);

				}

			} catch (codTrabajadorException ct) {

				if (!codTrabajador.equals("0"))
					System.out.println("Código del trabajador no válido");
				else
					salir = true;

			} catch (varianzaRecuentoMonetarioException v) {

				System.out.println(
						"Vaya parece que el dinero recaudado no coincide con la caja.(Avisando al manager...)");
				salir = true; // para que no pueda seguir operando hasta no lo supervise el manager en la
								// supuesta vista admin

			} catch (operacionesNegativasException op) {

				System.out.println("Las operaciones no pueden ser negativas, debe hacer 0 o muchas.");

			} catch (NumberFormatException n) {

				System.out.println("Introduzca un dato tipo númerico.");

			} catch (RuntimeException r) {

				System.out.println("Error inesperado inténtelo de nuevo o pulse 0 para salir.");

			}

		} while (!salir);

		System.out.println("Gracias por usar el programa.");

		sc.close();

	}

}
