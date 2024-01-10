package ejercicio1;

public class Portatil extends Ordenador {

	private boolean seguroPantalla;
	private double precioSeguroPantalla;
	
	public Portatil(double capacidadHDD, double frecuenciaProcesador, double precioBase, String marca,
			boolean seguroPantalla, double precioSeguroPantalla) {
		super(capacidadHDD, frecuenciaProcesador, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguroPantalla = precioSeguroPantalla;
	}

	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	public double getPrecioSeguroPantalla() {
		return precioSeguroPantalla;
	}

	public void setPrecioSeguroPantalla(double precioSeguroPantalla) {
		this.precioSeguroPantalla = precioSeguroPantalla;
	}

	@Override
	public String toString() {
		return super.toString() + " Portatil [seguroPantalla=" + seguroPantalla + ", precioSeguroPantalla=" + precioSeguroPantalla + "]";
	}
	
	
	
}
