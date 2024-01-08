package examen_tipoA;

import java.util.Arrays;

public class Inmobiliaria {
	
	/*1. El año pasado vendí mi piso mediante una inmobiliaria. En esta agenda, las características de los pisos son, como mínimo: dirección,
	número de metros cuadrados sin decimales, estado (nuevo, seminuevo o a reformar) que será un atributo tipo entero con un número
	para cada estado y el precio de venta que el dueño (quien lo quiere vender) quiere recibir cuando se vende.
	 En la clase Inmobiliaria, tendremos como característica la lista de pisos que se venden (un array de Pisos) y el número de vendedores que están trabajando en
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
	
	private Piso [] listaPiso;
	private int numVendedores;
	private int numPisos;
	
	//Constructor
	public Inmobiliaria(Piso[] listaPiso, int numVendedores, int numPisos) {
		super();
		this.listaPiso = listaPiso;
		this.numVendedores = numVendedores;
		this.numPisos = numPisos;
	}

	//Getters & Setters
	public Piso[] getListaPiso() {
		return listaPiso;
	}

	public void setListaPiso(Piso[] listaPiso) {
		this.listaPiso = listaPiso;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}
	

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	
	
	@Override
	public String toString() {
		return "Inmobiliaria [listaPiso=" + Arrays.toString(listaPiso) + ", numVendedores=" + numVendedores
				+ ", numPisos=" + numPisos + "]";
	}

	public void addPiso(Piso p) {
		
		listaPiso[numPisos]=p;
		numPisos++;
		
	}
	
	public Piso buscarById(int refCatastral) {
		boolean encontrado = false;
		int i=0;
		
		while (i < numPisos && !encontrado) {
			if(listaPiso[i].getRefCatastral()==refCatastral) {
				encontrado=true;
			}
			else {
				i++;
			}	;
		}
		
		if(encontrado) {
			
			return listaPiso[i];
		}
		else {
			return null;
		}
	}
	
	public double calcularPvp (double ganancia, int refCatastral) {
		double cien=100;
		double pvp=0;
		Piso p;
		
		p=buscarById(refCatastral);
		
		pvp=p.getPrecioVenta()+p.getPrecioVenta()*ganancia/cien;
		
		return pvp;
	}
	
	public Piso[] buscarByEstado (int estado) {
		
		int i=0;
		
		Piso [] listaEncontrado = new Piso [numPisos];
		while(i<numPisos) {
			
			if(listaPiso[i].getEstado()==estado) {
				listaEncontrado[i]=listaPiso[i];
			}
			
				i++;
			
		}
		return listaEncontrado;
	}
	
	public void mostrarLista(Piso [] listadoPisos) {
		
		for (int i = 0; i < listadoPisos.length; i++) {
			if(listadoPisos [i] !=null) {
				System.out.println(listadoPisos[i]);
			}
		}	}
	
	

	
}	


