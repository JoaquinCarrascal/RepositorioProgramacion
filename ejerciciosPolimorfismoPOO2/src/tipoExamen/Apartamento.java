package tipoExamen;

public class Apartamento extends Habitacion{

	private double servicioLimp;

	public Apartamento(double precioBase, boolean ocupada,int numHabitacion, double servicioLimp) {
		super(precioBase, ocupada, numHabitacion);
		this.servicioLimp = servicioLimp;
	}

	public Apartamento(int numHabitacion, double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada,
			int numOcupantes, double servicioLimp) {
		super(numHabitacion, precioBase, ocupada, nombreCliente, numDiasOcupada, numOcupantes);
		this.servicioLimp = servicioLimp;
	}

	public double getServicioLimp() {
		return servicioLimp;
	}

	public void setServicioLimp(double servicioLimp) {
		this.servicioLimp = servicioLimp;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimp=" + servicioLimp + "]" + super.toString();
	}
	
	public double calcularPrecioHab() {
		return super.calcularPrecioHab() + servicioLimp;
	}
	
}
