package ejercicioExamen;

public class Moto extends VehiculoGenerico{

	private double cilindrada;

	public Moto(String matricula, int tiempoEstacionado, double cilindrada) {
		super(matricula, tiempoEstacionado);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto cilindrada= " + cilindrada + super.toString();
	}
	
	@Override
	public double calcularPrecio(double cantFija, double plusLongitud) {
		int tope = 250;
		double dos = 2.0;
		if (cilindrada<tope) {
			return super.calcularPrecio(cantFija, plusLongitud)/dos;
		}
		else
			return super.calcularPrecio(cantFija, plusLongitud);
	}

}
