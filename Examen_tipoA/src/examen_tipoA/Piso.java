package examen_tipoA;

public class Piso {

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
	
	private String direccion;
	private int superficie;
	private int estado;
	private double precioVenta;
	private int refCatastral;
	
	//Constructor
	public Piso(String direccion, int superficie, int estado, double precioVenta, int refCatastral) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.estado = estado;
		this.precioVenta = precioVenta;
		this.refCatastral = refCatastral;
	}
	
	//Getters & Setters
	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getRefCatastral() {
		return refCatastral;
	}

	public void setRefCatastral(int refCatastral) {
		this.refCatastral = refCatastral;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", superficie=" + superficie + ", estado=" + estado + ", precioVenta="
				+ precioVenta + ", refCatastral=" + refCatastral + "]";
	}
	
	
	
	
	
}
