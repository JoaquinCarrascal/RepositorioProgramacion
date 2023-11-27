package ejercicio1;

import java.util.Scanner;

public class Principal {

	/*
	 * 1.Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos
	 * debe ser precio de fábrica). En esta clase se debe tener el método para
	 * calcular el precio de coste, que será el precio de fábrica más un porcentaje
	 * pasado como parámetro que será el coste en el transporte. En una clase
	 * Tienda, con un array de productos como atributo se podrá: - Listar datos de
	 * todos los productos. - Comprobar si un producto del array es “frágil” o no,
	 * mediante un método que devuelva un tipo boolean. - Añadir un producto a la
	 * lista pasando como parámetro un producto.
	 * 
	 * - Calcular la cantidad invertida por la tienda en comprar todos los
	 * productos, es decir, la suma de todos los precios de fábrica. - Calcular el
	 * PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro,
	 * sumado al precio de coste. - Calcular las posibles ganancias cuando se hayan
	 * vendido todos los productos, es decir, la suma de todos los precios de venta
	 * al público menos la suma de todos los precios de fábrica. Crear un main de
	 * prueba con un menú donde se pueda hacer todo esto.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tam = 100, casoSwitch = 0, casoSalida = 0;
		String aux;
		Producto[] lista = new Producto[tam];
		Tienda t = new Tienda(lista, 0);
		Producto p = new Producto(10, 11, "hola", true, false);
		Producto p2 = new Producto(10, 11, "adios", true, false);

		System.out.println("Bienvenido a la tienda Modas Manoli");
		do {
			mostrarMenu();
			aux = sc.nextLine();
			casoSwitch = Integer.parseInt(aux);
			switch (casoSwitch) {
			
			}
		} while (casoSwitch != casoSalida);
		sc.close();

	}

	public static void mostrarMenu() {

		System.out.println("\nFuncionalidades:\n" 
						 + "1.- Agregar productos.\n"
						 + "2.- Mostrar todos los productos agregados.\n" 
						 + "3.- Comprobar si un producto es fragil");

	}

}
