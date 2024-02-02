package ejercicio4tema4;

public abstract class Producto {

	private String nombre;
	private int codIdentificaion;
	private double precioUnitarioGenerico;
	
	public Producto(String nombre, int codIdentificaion, double precioUnitarioGenerico) {
		this.nombre = nombre;
		this.codIdentificaion = codIdentificaion;
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodIdentificaion() {
		return codIdentificaion;
	}

	public void setCodIdentificaion(int codIdentificaion) {
		this.codIdentificaion = codIdentificaion;
	}

	public double getPrecioUnitarioGenerico() {
		return precioUnitarioGenerico;
	}

	public void setPrecioUnitarioGenerico(double precioUnitarioGenerico) {
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codIdentificaion=" + codIdentificaion + ", precioUnitarioGenerico="
				+ precioUnitarioGenerico + "]";
	}
	
	public abstract double calcularPrecUnitario();
	
	
	
}
