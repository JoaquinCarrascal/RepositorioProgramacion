package trabajo_investigacion;

public class Persona {

	private int edad;
	private String nombre;
	//private var dni; //esto no es posible ya que no puede inferir en el tipo;
	
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	/*public var triggerMayoriaEdad (var edadDeMayoria) {
		if(edadDeMayoria < this.edad)
			return true;					//no podemos usar var en los parámentros del método
		else								//tampoco en lo que devuelve
			return false;
	}*/
	
	
	
}
