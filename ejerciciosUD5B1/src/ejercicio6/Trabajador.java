package ejercicio6;

public class Trabajador implements Comparable <Trabajador>{

	private String nombre;
	private String dni;
	private double horasTrabajadas;
	private double sueldoXhoras;
	private double sueldoFinal;
	
	public Trabajador(String nombre, String dni, double horasTrabajadas, double sueldoXhoras) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoXhoras = sueldoXhoras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoXhoras() {
		return sueldoXhoras;
	}

	public void setSueldoXhoras(double sueldoXhoras) {
		this.sueldoXhoras = sueldoXhoras;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoXhoras=" + sueldoXhoras + ", sueldoFinal=" + sueldoFinal + "]";
	}

	@Override
	public int compareTo(Trabajador o) {
		OrdenarPorSueldo ops = new OrdenarPorSueldo();
		if(this.horasTrabajadas < o.horasTrabajadas)
			return -1;
		if(this.horasTrabajadas > o.horasTrabajadas)
			return 1;
		else
			return ops.compare(this.sueldoFinal, o.getSueldoFinal());
	}
	
}
