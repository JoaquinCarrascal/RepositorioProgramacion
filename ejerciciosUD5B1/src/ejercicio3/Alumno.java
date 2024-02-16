package ejercicio3;

public class Alumno {

	private String nombre;
	private int codAlumno;
	
	public Alumno(String nombre, int codAlumno) {
		this.nombre = nombre;
		this.codAlumno = codAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", codAlumno=" + codAlumno + "]";
	}
	
	
	
	
	
	
}
