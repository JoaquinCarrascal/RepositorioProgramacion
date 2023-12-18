package ejemplo1;

import java.util.Scanner;

public class ppal {

	public static void main(String[] args) {
		// Producto p = new Producto ();//mal!

		Scanner sc = new Scanner(System.in);
		String aux, nombre;
		double precio,porCentGanan,descuento;
		int casoSalida = 0, casoMenu = 0, tipo = 0, tam = 100,secciont,iD;
		boolean estado;

		Producto[] lista = new Producto[tam];
		Producto p1 = new Producto(1,"Lechuga", 1.20, 1, true);
		Producto p2 = new Producto(2,"Coliflor", 0.90, 1, true);
		Producto p3 = new Producto(3,"Aguacate", 1.90, 1, true);
		Producto p4 = new Producto(4,"Iphone 14", 916.95, 2, true);
		Producto p = new Producto();
		Tienda tien = new Tienda(lista, 10);
		tien.agregarProd(p1);
		tien.agregarProd(p2);
		tien.agregarProd(p3);
		tien.agregarProd(p4);

		do {
			System.out.println("1 agregar producto\n"
							 + "2 mostrar lista\n"
							 + "3 buscar por seccion\n"
							 + "4 buscar producto por id\n"
							 + "5 cambiar precio fábrica de una seccion entera\n"
							 + "6 calcular descuento de un producto\n"
							 + "7 cerrar seccion en venta\n"
							 + "8 mostrar en venta");
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
				aux = sc.nextLine();
				p = tien.findById(Integer.parseInt(aux));
				if (p == null)
					System.out.println("Producto no encontrado");
				else
					System.out.println(p);
				break;
				
			case 5:
				System.out.println("diga sección");
				aux = sc.nextLine();
				secciont = Integer.parseInt(aux);
				System.out.println("diga nuevo precio");
				aux = sc.nextLine();
				precio = Double.parseDouble(aux);
				tien.cambiarPrecFabSeccion(secciont, precio);
				break;
			
			case 6:
				System.out.println("Diga id del producto");
				aux = sc.nextLine();
				iD = Integer.parseInt(aux);
				System.out.println("Diga porcentaje de ganancia que quiere conseguir");
				aux = sc.nextLine();
				porCentGanan = Double.parseDouble(aux);
				System.out.println("Diga porcentaje que quiere descontar");
				aux = sc.nextLine();
				descuento = Double.parseDouble(aux);
				
				System.out.printf("El precio final del producto será de: %.2f€ con el descuento del %.2f porciento.\n",
						tien.calcularDescuento(porCentGanan, iD, descuento),descuento);
				break;
			
			case 7:
				System.out.println("diga sección");
				aux = sc.nextLine();
				secciont = Integer.parseInt(aux);
				System.out.printf("%d productos dados de baja.\n",tien.cambiarEnVentaSeccion(secciont));
				break;
				
			case 8:
				tien.mostrarListaActiva();
				break;
				
			case 0:
				break;
			default:

			}
		} while (casoMenu != casoSalida);
		
		sc.close();
	}

}
