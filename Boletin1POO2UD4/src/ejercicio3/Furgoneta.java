package ejercicio3;

public class Furgoneta extends VehiculoAMotor{

	public String marca;
	public int cantidadImpuesto;

	public Furgoneta(int tipoEmision, double caballos, int centimetrosCub
			, String marca, int cantidadImpuesto) {
		super(tipoEmision, caballos, centimetrosCub);
		this.marca = marca;
		this.cantidadImpuesto = cantidadImpuesto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double calculoImpuestoCirc(double porcentAplicacionMoto,double porcentAplicacionCoche) {
		return super.calculoImpuestoCirc(porcentAplicacionMoto
				,porcentAplicacionCoche) + cantidadImpuesto;
	 }
}
