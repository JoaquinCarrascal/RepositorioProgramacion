package ejemploListObjeto;

public class Figura {

	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + "]";
	}
	
	
	
}
