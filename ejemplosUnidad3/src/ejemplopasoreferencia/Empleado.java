package ejemplopasoreferencia;

public class Empleado {
	private String primerNombre;
	private String apellidoPaterno;
	private Fecha fechaNacimiento;
	private Fecha fechaContratacion;

	public Empleado(String primerNombre, String apellidoPaterno, Fecha fechaNacimiento, Fecha fechaContratacion) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Fecha getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Fecha fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	@Override
	public String toString() {
		return "Empleado \nNombre: " + primerNombre + "\nApellido Paterno: " + apellidoPaterno + "\nFecha Nacimiento: "
				+ fechaNacimiento + "\nFecha Contratación: " + fechaContratacion;
	}

	public void felicitarCumple(Fecha cump) {
		if (cump.getDia() == fechaNacimiento.getDia() 
			&& cump.getMes() == fechaNacimiento.getMes()) 
			System.out.println("Felicidades campeón!!!");
	}

	public Fecha rejuvenecer(Fecha cumple) {
		int num = 5;
		cumple.setAnio(cumple.getAnio() + num);
		return cumple;
	}
}
