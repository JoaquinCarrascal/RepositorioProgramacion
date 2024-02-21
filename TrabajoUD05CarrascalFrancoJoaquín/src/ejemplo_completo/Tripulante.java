package ejemplo_completo;

public abstract class Tripulante implements ICalculadorSueldo{
	
	private String nombre;
	private double sueldoXHora;
	private double horasTrabajadas;
	private String idTripulante;
	
	public Tripulante(String nombre, double sueldoXHora, double horasTrabajadas, String idTripulante) {
		this.nombre = nombre;
		this.sueldoXHora = sueldoXHora;
		this.horasTrabajadas = horasTrabajadas;
		this.idTripulante = idTripulante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoXHora() {
		return sueldoXHora;
	}

	public void setSueldoXHora(double sueldoXHora) {
		this.sueldoXHora = sueldoXHora;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getIdTripulante() {
		return idTripulante;
	}

	public void setIdTripulante(String idTripulante) {
		this.idTripulante = idTripulante;
	}

	@Override
	public String toString() {
		return "Tripulante [nombre=" + nombre + ", sueldoXHora=" + sueldoXHora + ", horasTrabajadas=" + horasTrabajadas
				+ ", idTripulante=" + idTripulante + "]";
	}
	
	public double calcularSueldoUnitario(double porcentajeInterior) {
		return horasTrabajadas * sueldoXHora;	
	}
	
	public abstract void avisoDeTrabajo();
	
	
	

}
