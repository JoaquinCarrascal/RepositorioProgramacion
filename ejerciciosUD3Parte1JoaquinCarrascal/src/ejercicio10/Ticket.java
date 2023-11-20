package ejercicio10;

public class Ticket 
{

	private int validezPersonal;
	private double precioUnit;
	private String viaje;
	
	public Ticket(int validezPersonal, double precioUnit, String viaje) {
		this.validezPersonal = validezPersonal;
		this.precioUnit = precioUnit;
		this.viaje = viaje;
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

	public String getViaje() {
		return viaje;
	}

	public void setViaje(String viaje) {
		this.viaje = viaje;
	}
	
	

}
