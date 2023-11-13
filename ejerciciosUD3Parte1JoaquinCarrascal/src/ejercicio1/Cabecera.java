package ejercicio1;

public class Cabecera {

	private String nombreAs;
	private String nombreAul;
	private String fecha;
	
	public Cabecera(String nombreAs, String nombreAul, String fecha) {
		this.nombreAs = nombreAs;
		this.nombreAul = nombreAul;
		this.fecha = fecha;
	}
	
	public void impresionCabecera() {
		System.out.println(nombreAs + " \t " + nombreAul + " \t " + fecha);
	}
	
	
}
