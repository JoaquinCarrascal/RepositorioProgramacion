package ejercicio2;

public class Carta extends Documento{

	private String fecha;

	public Carta(String nombreEmpresa, String direccionEmpresa, String nombreCEO, String fecha) {
		super(nombreEmpresa, direccionEmpresa, nombreCEO);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println("La fecha de envío de esta carta es: " + fecha);
	}
	
}
