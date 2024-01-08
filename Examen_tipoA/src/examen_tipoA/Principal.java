package examen_tipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. El año pasado vendí mi piso mediante una inmobiliaria. En esta agenda, las características de los pisos son, como mínimo: dirección,
		número de metros cuadrados sin decimales, estado (nuevo, seminuevo o a reformar) que será un atributo tipo entero con un número
		para cada estado y el precio de venta que el dueño (quien lo quiere vender) quiere recibir cuando se vende. En la clase Inmobiliaria,
		tendremos como característica la lista de pisos que se venden (un array de Pisos) y el número de vendedores que están trabajando en
		ella (solo el número, no hacen falta sus datos).
		En ambas calases tendremos los constructores, getters and setters y toString adecuados, además de los métodos propios (que irán todos
		en la clase Inmobiliaria). Se debe crear una clase principal, con un menú donde se podrán hacer las siguientes cosas. El programa se
		repetirá hasta que el usuario quiera. En cada caso del menú se deben mostrar las cosas pedidas, por ejemplo, si se pide buscar algo
		debemos mostrar en el main el resultado de la búsqueda. También se pueden agregar varios pisos a la lista para hacer las pruebas antes
		de empezar el menú.
		a) Agregar un nuevo piso a la lista leyendo los datos por teclado.
		b) CalcularPrecioFinalVenta, que calculará el precio final de venta del piso sumándole al precio que quiere ganar el dueño un porcentaje
		dado como parámetro.
		c) Buscar y devolver todos los pisos cuyo estado es nuevo.
		d) Modificar el precio de un piso de venta que quiere el dueño por uno nuevo leído por teclado, por si el dueño quiere rebajar el precio.
		e) Calcular el precio del metro cuadro de un piso, dividiendo el precio final de venta al público por el número de metros que tiene el
		piso. Vosotros decidís la forma de buscarlo.
		f) Calcular cuánto ganaría la inmobiliaria si vendiera todos los pisos cuyo estado es seminuevo.
		g) Calcular cuánto ganaría cada vendedor, si se vendieran todos los pisos y se repartieran las ganancias a partes iguales.
		Criterios de corrección. Cada criterio se puntúa sobre 10. Se considerará un error muy grave que el programa no compile
		dividiendo la nota por 2.
		3.2 Instancias y llamadas: Creación de objetos adecuadamente (1 punto), llamadas en main (2 puntos), uso de devoluciones en
		main (2.5 puntos), reutilización de código (2 puntos), uso de parámetros en el main (2.5 puntos)
		3.3 Escritura de métodos con parámetros y devoluciones adecuados: agregar (0.5 puntos), calcularPrecioFinalVenta (0.5
		puntos), buscarNuevos (2 puntos), modificar (1 punto), calcularMetroCuadrado (3 puntos), calcularGananciasSeminuevos (1.5
		puntos), calcularGananciasPorVendedor (1.5 puntos)*/
		
		int op, superficie,estado,estado2 ,refCatastral1,refCatastral2,tam=10,numVendedores=4,numPisos=0;
		String direccion;
		double precioBase, ganancia;
		Piso p1,p2,p3,p4,p5,p6,p7;
		Piso [] listaPisos = new Piso [tam];
		Inmobiliaria inmo;
		p1= new Piso("Sorda",60,3,120000,123);
		p2= new Piso("Júpiter",90,2,240000,124);
		p3= new Piso("Velázquez",80,3,100000,125);
		p5= new Piso("Gonzalo Bilbao",120,1,350000,126);
		p6= new Piso("Guadalquivir",35,2,70000,127);
		p7= new Piso("Teodosio",75,3,1450000,128);
		inmo=new Inmobiliaria (listaPisos,numVendedores,numPisos);
		inmo.addPiso(p1);
		inmo.addPiso(p2);
		inmo.addPiso(p3);
		inmo.addPiso(p5);
		inmo.addPiso(p6);
		inmo.addPiso(p7);
		
		
		do {
			System.out.println("""
					
					(1).Para agregar un nuevo piso.
					(2).Para calcular el precio final de venta.
					(3).Buscar y devolver todos los pisos nuevos.
					(4).Modificar el precio de un piso.
					(5).Calcular el precio del metro²
					(6).Calcular ganancias de la inmobiliaria si vendemos todos los pisos seminuevos.
					(7).Calcular las ganancias de cada vendedor si se venden todos los pisos. 
					
					""");
			op=Leer.datoInt();
			switch(op) {
				case 1:
					
					System.out.println("Indique la calle del piso");
					direccion=Leer.dato();
					System.out.println("Indique la superficie del piso sin decimales");
					superficie=Leer.datoInt();
					System.out.println("Indique 1 para nuevo, 2 para seminuevo, 3 a reformar");
					estado=Leer.datoInt();
					System.out.println("Indique el precio base");
					precioBase=Leer.datoDouble();
					System.out.println("Indique la referencia catastral 3 dígitos");
					refCatastral1=Leer.datoInt();
					p4=new Piso(direccion,superficie,estado,precioBase,refCatastral1);
					
					inmo.addPiso(p4);
					break;
					
				case 2:
					
					System.out.println("Diga la referencia catastral del piso al que quiere calcularle el pvp");
					refCatastral2=Leer.datoInt();
					System.out.println("Indique el porcentaje de ganancia que quiere");
					ganancia=Leer.datoDouble();
					System.out.printf("El pvp del piso es de: %.2f €.\n",inmo.calcularPvp(ganancia, refCatastral2));
					
					break;
					
				case 3:
					
					estado2=1;
					inmo.mostrarLista(inmo.buscarByEstado(estado2));
					
					break;
					
			}
		}while (op!=0);

	}

}
