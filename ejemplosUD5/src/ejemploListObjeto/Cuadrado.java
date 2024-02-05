package ejemploListObjeto;

public class Cuadrado extends Figura{

	private int numLados;

	public Cuadrado(String nombre,String id, int numLados) {
		super(nombre,id);
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
