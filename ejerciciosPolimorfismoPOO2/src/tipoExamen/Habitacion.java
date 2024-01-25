package tipoExamen;

public class Habitacion {
	
	private int numHabitacion;
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDiasOcupada;
	private int numOcupantes;
	
	public Habitacion(double precioBase, boolean ocupada,int numHabitacion) {
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.numHabitacion = numHabitacion;
	}

	public Habitacion(int numHabitacion, double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada,
			int numOcupantes) {
		this.numHabitacion = numHabitacion;
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDiasOcupada = numDiasOcupada;
		this.numOcupantes = numOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDiasOcupada() {
		return numDiasOcupada;
	}

	public void setNumDiasOcupada(int numDiasOcupada) {
		this.numDiasOcupada = numDiasOcupada;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	
	@Override
	public String toString() {
		return "Habitacion [numHabitacion=" + numHabitacion + ", precioBase=" + precioBase + ", ocupada=" + ocupada
				+ ", nombreCliente=" + nombreCliente + ", numDiasOcupada=" + numDiasOcupada + ", numOcupantes="
				+ numOcupantes + "]";
	}

	public double calcularPrecioHab() {
		return precioBase * numDiasOcupada;
	}
	
	

}
