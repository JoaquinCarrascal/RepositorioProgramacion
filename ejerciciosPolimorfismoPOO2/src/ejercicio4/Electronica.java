package ejercicio4;

public class Electronica extends Producto{
	
	private double impuestoLujo;

	public Electronica(double precioUnit, String nombre, String codIdentificacion, double impuestoLujo) {
		super(precioUnit, nombre, codIdentificacion);
		this.impuestoLujo = impuestoLujo;
	}

	public double getImpuestoLujo() {
		return impuestoLujo;
	}

	public void setImpuestoLujo(double impuestoLujo) {
		this.impuestoLujo = impuestoLujo;
	}

	@Override
	public String toString() {
		return super.toString() +  "Electronica [impuestoLujo=" + impuestoLujo + "]";
	}

	@Override
	public double calcularPVP() {
		int cien = 100;
		return super.getPrecioUnit() + (super.getPrecioUnit()*impuestoLujo/cien);
	}
	
	

}
