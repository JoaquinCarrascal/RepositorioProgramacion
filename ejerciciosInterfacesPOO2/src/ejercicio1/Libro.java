package ejercicio1;

public class Libro extends Papeleria {

	private boolean prestado;

	public Libro(String nombre, int anyoPublicacion, boolean prestado) {
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
		return "Libro [prestado=" + prestado + "]" + super.toString();
	}
	
}
