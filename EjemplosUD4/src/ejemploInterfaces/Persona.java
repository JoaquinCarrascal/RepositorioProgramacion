package ejemploInterfaces;

public class Persona implements IDepredador{

	private String nombre;
	private int anyos;
	private boolean razonar;

	public Persona(String nombre, int anyos, boolean razonar) {
		this.nombre = nombre;
		this.anyos = anyos;
		this.razonar = razonar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	public boolean isRazonar() {
		return razonar;
	}

	public void setRazonar(boolean razonar) {
		this.razonar = razonar;
	}

	@Override
	public void localizar(Animal presa) {
		
		
	}

	@Override
	public void cazar(Animal presa) {
		
		
	}

	
	
	
	
}
