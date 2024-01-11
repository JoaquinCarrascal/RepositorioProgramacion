package ejercicio3;

public class Motocicleta extends VehiculoAMotor{

	public String marca;

	public Motocicleta(int tipoEmision, double caballos, int centimetrosCub, String marca) {
		super(tipoEmision, caballos, centimetrosCub);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double calculoImpuestoCirc() {
	double porcentAplicacion = 60;
	int cien = 100;
		return super.calculoImpuestoCirc() + (getCentimetrosCub()*porcentAplicacion/cien);
	 }
	
}
