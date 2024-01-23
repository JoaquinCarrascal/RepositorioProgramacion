package ejercicio1;

public class Papeleria {

	private String nombre;
	private int AnyoPublicacion;
	
	public Papeleria(String nombre, int anyoPublicacion) {
		this.nombre = nombre;
		this.AnyoPublicacion = anyoPublicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoPublicacion() {
		return AnyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.AnyoPublicacion = anyoPublicacion;
	}

	@Override
	public String toString() {
		return "Papeleria [nombre=" + nombre + ", AnyoPublicacion=" + AnyoPublicacion + "]";
	}
	
	
	
}
