package ejercicio4;

public abstract class Producto {

	private double precioUnit;
	private String nombre;
	private String codIdentificacion;
	
	public Producto(double precioUnit, String nombre, String codIdentificacion) {
		this.precioUnit = precioUnit;
		this.nombre = nombre;
		this.codIdentificacion = codIdentificacion;
	}

	public double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodIdentificacion() {
		return codIdentificacion;
	}

	public void setCodIdentificacion(String codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}

	@Override
	public String toString() {
		return "Producto [precioUnit=" + precioUnit + ", nombre=" + nombre + ", codIdentificacion=" + codIdentificacion
				+ "]";
	}
	
	public abstract double calcularPVP();
	
	
	
}
