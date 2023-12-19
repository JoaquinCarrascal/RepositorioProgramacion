package examenCorredores;

public class Carrera {
	
	private Corredor [] lista;
	private String nombreCarrera;
	private int numCorredores;
	
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	public Carrera(Corredor[] lista) {
		this.lista = lista;
	}

	public Corredor[] getLista() {
		return lista;
	}

	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void agregarCorredor(Corredor corredor) {
		if(numCorredores<lista.length)
			lista[numCorredores++] = corredor;
	}
	
	
	

}
