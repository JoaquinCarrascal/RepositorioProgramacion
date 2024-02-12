package ejemploMap;

public class Alumno {

	private double notaMedia;
	private int iD;
	private String nombre;
	
	public Alumno(double notaMedia, int iD, String nombre) {
		this.notaMedia = notaMedia;
		this.iD = iD;
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [notaMedia=" + notaMedia + ", iD=" + iD + ", nombre=" + nombre + "]";
	}
	
	
	
}
