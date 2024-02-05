package ejemploListObjeto;

public class Figura {

	private String nombre;
	private String id;

	public Figura(String nombre,String id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", id=" + id + "]";
	}

	
	
	
	
}
