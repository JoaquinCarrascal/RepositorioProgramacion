package ejercicioExamen;

public class VehiculoGenerico implements IAparcamiento{

	private String matricula;
	private int tiempoEstacionado; //lo pongo int porque dice que solo cuenta minutos
	
	public VehiculoGenerico(String matricula, int tiempoEstacionado) {
		this.matricula = matricula;
		this.tiempoEstacionado = tiempoEstacionado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getTiempoEstacionado() {
		return tiempoEstacionado;
	}

	public void setTiempoEstacionado(int tiempoEstacionado) {
		this.tiempoEstacionado = tiempoEstacionado;
	}

	@Override
	public String toString() {
		return " VehiculoGenerico [matricula=" + matricula + ", tiempoEstacionado=" + tiempoEstacionado + "]";
	}

	@Override
	public double calcularPrecio(double cantFija, double plusLongitud) {
		return tiempoEstacionado * cantFija;
	}
	
}
