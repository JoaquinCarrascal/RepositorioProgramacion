package ejercicio1;

public class Producto {

	private double precioBase;
	private double precioCoste;
	private String nombre;
	private boolean fragilidad;
	private boolean activo;
	
	public Producto(double precioBase, String nombre, boolean fragilidad, boolean activo) {
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.fragilidad = fragilidad;
		this.activo = activo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(boolean fragilidad) {
		this.fragilidad = fragilidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "[precioBase=" + precioBase + ", precioCoste=" + precioCoste + ", nombre=" + nombre
				+ ", fragilidad=" + fragilidad + ", activo=" + activo + "]";
	}
	
	public double calcularPrecioCoste(double transporte) {
		int cien = 100;
		precioCoste = precioBase + (transporte*precioBase/cien);
		return precioCoste;
	}
	
	
	
	
}
