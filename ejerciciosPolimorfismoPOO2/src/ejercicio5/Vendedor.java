package ejercicio5;

public class Vendedor extends Empleado{
	
	private double cantidadVentas;
	private double incentivo;
	private int topeVenta;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado,
			double cantidadVentas,double incentivo,int topeVenta) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
		this.topeVenta = topeVenta;
	}

	public double getCantidadVentas() {
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
		return "Vendedor cantidadVentas=" + cantidadVentas + ", incentivo=" 
				+ incentivo +", topeVenta=" + topeVenta + super.toString();
	}

	@Override
	public double calcularSueldo() {
		int cien = 100;
		return super.calcularSueldo()+cantidadVentas*incentivo/cien;
	}
	
	public boolean triggerVentas() {
		if(topeVenta<cantidadVentas)
			return true;
		else
			return false;
	}
	
	
	

}
