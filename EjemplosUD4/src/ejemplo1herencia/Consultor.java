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
	
	public double calcularPaga() {
		return tarifa * horas;
	}
	
	public double calcularPagaV2() {
		return super.calcularPagaV2() + tarifa * horas; //si la madre tiene un parámetro aunque
														//la hija no lo use hay que pasarlo de todas formas
														// sino sería una sobrecarga de métodos
	}
	
	public void avisoExcesoTrabajo() {
		int tope = 40;
		if(horas>tope)
			System.out.println("Este consultor ya ha superado las 40 horas semanales.");
	}
	
	

}
