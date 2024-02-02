package ejercicio4tema4;

public class Electronica extends Producto{

	private double impuestoLujo;

	public Electronica(String nombre, int codIdentificaion, double precioUnitarioGenerico, double impuestoLujo) {
		super(nombre, codIdentificaion, precioUnitarioGenerico);
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
		return super.toString() + "Electronica [impuestoLujo=" + impuestoLujo + "]";
	}

	@Override
	public double calcularPrecUnitario() {
		return 0;
	}
	
	
	
	
}
