package tipoExamen;

public class Suite extends Habitacion{

	private double mCuadrados;
	private double costoSerHabit; //costo de servicio habitaciones
	private double descuento;
	
	public Suite(double precioBase, boolean ocupada,int numHabitacion, double mCuadrados, double costoSerHabit, double descuento) {
		super(precioBase, ocupada, numHabitacion);
		this.mCuadrados = mCuadrados;
		this.costoSerHabit = costoSerHabit;
		this.descuento = descuento;
	}

	public Suite(int numHabitacion, double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupada,
			int numOcupantes, double mCuadrados, double costoSerHabit, double descuento) {
		super(numHabitacion, precioBase, ocupada, nombreCliente, numDiasOcupada, numOcupantes);
		this.mCuadrados = mCuadrados;
		this.costoSerHabit = costoSerHabit;
		this.descuento = descuento;
	}



	public double getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public double getCostoSerHabit() {
		return costoSerHabit;
	}

	public void setCostoSerHabit(double costoSerHabit) {
		this.costoSerHabit = costoSerHabit;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
	@Override
	public String toString() {
		return "Suite [mCuadrados=" + mCuadrados + ", costoSerHabit=" + costoSerHabit + ", descuento=" + descuento
				+ "]" + super.toString();
	}

	public double calcularPrecioHab() {
		return (super.calcularPrecioHab() + costoSerHabit)/descuento;
	}
	
}
