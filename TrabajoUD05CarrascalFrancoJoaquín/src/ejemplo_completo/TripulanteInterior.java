package ejemplo_completo;

public class TripulanteInterior extends Tripulante{
	
	private String tallaPijama;

	public TripulanteInterior(String nombre, double sueldoXHora, double horasTrabajadas, String idTripulante,
			String tallaPijama) {
		super(nombre, sueldoXHora, horasTrabajadas, idTripulante);
		this.tallaPijama = tallaPijama;
	}

	public String getTallaPijama() {
		return tallaPijama;
	}

	public void setTallaPijama(String tallaPijama) {
		this.tallaPijama = tallaPijama;
	}

	@Override
	public String toString() {
		return "TripulanteInterior [tallaPijama=" + tallaPijama + "]";
	}

	@Override
	public void avisoDeTrabajo() {
		System.out.println("La primera regla del club de los developers,\n"
				+ "es que no se habla del club de los developers");
	}
	
	@Override
	public double calcularSueldoUnitario(double porcentajeInterior) {
		var cien = 100;
		return super.calcularSueldoUnitario(porcentajeInterior) - super.calcularSueldoUnitario(porcentajeInterior)*porcentajeInterior/cien;
	}
	
	

}
