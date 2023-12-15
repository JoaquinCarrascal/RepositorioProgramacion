package ejemplo1;

import java.util.Scanner;

public class ppal {

	public static void main(String[] args) {
		// Producto p = new Producto ();//mal!

		Scanner sc = new Scanner(System.in);
		String aux, nombre;
		double precio;
		int casoSalida = 0, casoMenu = 0, tipo = 0, tam = 100,secciont;
		boolean estado;

		Producto[] lista = new Producto[tam];
		Producto p1 = new Producto("Lechuga", 1.20, 1, true);
		Producto p2 = new Producto("Iphone 14", 916.95, 2, true);
		Tienda tien = new Tienda(lista, 10);
		tien.agregarProd(p1);
		tien.agregarProd(p2);

		do {
			System.out.println("1 agregar producto\n"
							 + "2 mostrar lista\n"
							 + "3 buscar por seccion"
							 + "4 calcular el pvp");
			aux = sc.nextLine();
			casoMenu = Integer.parseInt(aux);
			switch (casoMenu) {
			case 1:
				System.out.println("diga nombre");
				nombre = sc.nextLine();
				System.out.println("diga precio");
				aux = sc.nextLine();
				precio = Double.parseDouble(aux);
				System.out.println("Diga tipo");
				aux = sc.nextLine();
				tipo = Integer.parseInt(aux);
				System.out.println("activo = 1 , inactivo = 0");
				aux = sc.nextLine();
				if (Integer.parseInt(aux) == 1)
					estado = true;
				else
					estado = false;
				tien.agregarProd(new Producto(nombre, precio, tipo, estado));
				break;
				
			case 2:
				tien.mostrarLista();
				break;
				
			case 3:
				System.out.println("diga seccion");
				aux = sc.nextLine();
				secciont = Integer.parseInt(aux);
				tien.mostrarLista(tien.findBySection(secciont));
				break;
				
			case 4:
				System.out.println("diga id de producto");
				System.out.println("diga el procentaje de ganancia que quiere tener");
				break;

			case 0:
				break;
			default:

			}
		} while (casoMenu != casoSalida);

	}

}
