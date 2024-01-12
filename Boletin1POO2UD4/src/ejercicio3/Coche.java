package ejercicio3;

public class Coche extends VehiculoAMotor{
	
	public String marca;

	public Coche(int tipoEmision, double caballos, int centimetrosCub, String marca) {
		super(tipoEmision, caballos, centimetrosCub);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double calculoImpuestoCirc(double porcentAplicacionMoto
			,double porcentAplicacionCoche) {
		int cien = 100;
		return super.calculoImpuestoCirc(porcentAplicacionMoto
				,porcentAplicacionCoche) + 
				(getCaballos()*porcentAplicacionCoche/cien);
	 }
}
