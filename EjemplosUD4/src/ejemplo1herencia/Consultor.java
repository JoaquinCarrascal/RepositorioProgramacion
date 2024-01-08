package ejemplo1herencia;

public class Consultor extends Trabajador {

	private double tarifa;
	private double horas;
	
	public Consultor(String nombre, String puesto, String dni, double tarifa, double horas) {
		super(nombre, puesto, dni);
		this.tarifa = tarifa;
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return super.toString() + "Consultor [tarifa=" + tarifa + ", horas=" + horas + "]";
	}
	
	

}
