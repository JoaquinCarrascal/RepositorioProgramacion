package ejercicio5;

public class Vendedor extends Empleado{
	
	private int cantidadVentas;
	private double incentivo;
	private int topeVenta;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado,
			int cantidadVentas,double incentivo,int topeVenta) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
		this.topeVenta = topeVenta;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + super.toString();
	}

	@Override
	public double calcularSueldo() {//el vendedor tiene una ganancia de x por venta.
		return super.calcularSueldo()+cantidadVentas*incentivo;
	}
	
	public boolean triggerVentas() {
		if(topeVenta<cantidadVentas)
			return true;
		else
			return false;
	}
	
	
	

}
