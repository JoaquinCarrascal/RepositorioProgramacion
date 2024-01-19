package ejemploInterfaces;

public class Animal implements IDepredador{

	public String nombre;
	public int numPatas;
	
	public Animal(String nombre, int numPatas) {
		this.nombre = nombre;
		this.numPatas = numPatas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", numPatas=" + numPatas + "]";
	}

	@Override
	public void localizar(Animal presa) {

		System.out.println("Buscando");
		
	}

	@Override
	public void cazar(Animal presa) {
	
		System.out.println("¡Al ataquerr!");
		
	}
	
	
	
	
	
}
