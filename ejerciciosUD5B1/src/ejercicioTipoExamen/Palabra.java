package ejercicioTipoExamen;

public class Palabra implements Comparable <String> {

	private int id;
	private String nombre;
	private String descripcion;
	
	public Palabra(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int compareTo(String o) {
		return this.nombre.compareToIgnoreCase(o);
	}
	
	
	
	
	
}
