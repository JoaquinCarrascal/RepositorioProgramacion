package ejemplo1;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno(String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
	
	public Alumno() {
		
	}
	
	public double calcularMedia() {
		double suma, media;
		int dos = 2;
		suma = notaPro + notaBD;
		media = suma / dos;
		return media;
		//o simplemente
		//double dos = 2;
		//return (notaPro+notaBD)/dos;
	}
	
	public void mostrarMedia(double media) {
		System.out.println(nombre);
		System.out.printf("Su nota media es: %.2f",media);
	}
	
	
}
