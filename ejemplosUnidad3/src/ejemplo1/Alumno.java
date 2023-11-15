package ejemplo1;

public class Alumno {

	//Atributos (no se inicializan en las clases que definen a los objetos)
	//se declaran con private delante
	
	private String nombre;
	private int edad;
	private double notaMedia;
	private boolean matriculado;
	
	//constructores para crear un objeto con valores
	//lo que va dentro del parentesis se llaman parámetros
	public Alumno(String nombre,int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Alumno(){
	}
	//Métodos
	
	//método para imprimir
	public void mostrarDatos(String calle) {
		//Cuerpo
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Nota media: " + notaMedia);
		System.out.println("Calle: " + calle);
	}
	/*calcularMedia
	insertarNota
	darAlta
	matricular
	medirAsistencia
	notificarFaltas*/
	
	
}
