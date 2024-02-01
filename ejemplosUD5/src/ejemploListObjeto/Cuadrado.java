package ejemploListObjeto;

public class Cuadrado extends Figura{

	private int numLados;

	public Cuadrado(String nombre, int numLados) {
		super(nombre);
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	@Override
	public String toString() {
		return "Cuadrado [numLados=" + numLados + "]" + super.toString();
	}
	
	
	
}
