package ejercicioExamen;

public class Furgoneta extends VehiculoGenerico {

	private double longitud;

	public Furgoneta(String matricula, int tiempoEstacionado, double longitud) {
		super(matricula, tiempoEstacionado);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Furgoneta longitud= " + longitud + super.toString();
	}

	@Override
	public double calcularPrecio(double cantFija, double plusLongitud) {
		int tope = 4;
		if (longitud > tope) {
			return ((longitud - tope) * plusLongitud) + super.calcularPrecio(cantFija, plusLongitud);
		} else
			return super.calcularPrecio(cantFija, plusLongitud);
	}

	public boolean avisoTrigger() {
		int tope = 8;
		if (longitud > tope)
			return true;
		else
			return false;
	}

}
