package ejercicio10;

public class Ticket {

	private int validezPersonal;
	private double precioUnit;

	public Ticket(int validezPersonal, double precioUnit) {
		this.validezPersonal = validezPersonal;
		this.precioUnit = precioUnit;
	}

	public int getValidezPersonal() {
		return validezPersonal;
	}

	public void setValidezPersonal(int validezPersonal) {
		this.validezPersonal = validezPersonal;
	}

	public double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}
	
	public double calcPrecioBilletes(int numPersonas) {
		return numPersonas * precioUnit;
	}
}
