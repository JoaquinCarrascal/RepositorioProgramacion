package ejemplo_completo;

public class TripulanteExterior extends Tripulante{
	
	private String codigoLicencia;

	public TripulanteExterior(String nombre, double sueldoXHora, double horasTrabajadas, String idTripulante,
			String codigoLicencia) {
		super(nombre, sueldoXHora, horasTrabajadas, idTripulante);
		this.codigoLicencia = codigoLicencia;
	}

	public String getCodigoLicencia() {
		return codigoLicencia;
	}

	public void setCodigoLicencia(String codigoLicencia) {
		this.codigoLicencia = codigoLicencia;
	}

	@Override
	public String toString() {
		return "TripulanteExterior [codigoLicencia=" + codigoLicencia + "]";
	}

	@Override
	public void avisoDeTrabajo() {
		System.out.println("Reproduce Space Oddity de David Bowie cuando salgas.");
		
	}
	
	

}
