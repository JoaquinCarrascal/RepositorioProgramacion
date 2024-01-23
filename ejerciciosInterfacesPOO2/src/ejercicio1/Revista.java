package ejercicio1;

public class Revista extends Papeleria {

	private boolean prestado;

	public Revista(String nombre, int anyoPublicacion, boolean prestado) {
		super(nombre, anyoPublicacion);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		return "Revista [prestado=" + prestado + "]" + super.toString();
	}
	
}
