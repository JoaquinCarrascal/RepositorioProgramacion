package ejercicio3;

public class Furgoneta extends VehiculoAMotor{

	public String marca;

	public Furgoneta(int tipoEmision, double caballos, int centimetrosCub, String marca) {
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
		int cantidadFijaDeAplicacion = 123;
		return super.calculoImpuestoCirc() + cantidadFijaDeAplicacion;
	 }
}
