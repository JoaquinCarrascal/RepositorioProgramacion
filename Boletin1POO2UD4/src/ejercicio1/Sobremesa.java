package ejercicio1;

public class Sobremesa extends Ordenador{

	private double precioMontaje;

	public Sobremesa(double capacidadHDD, double frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(capacidadHDD, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString() + " Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	
	
}
