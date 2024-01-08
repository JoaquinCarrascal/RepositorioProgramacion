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
		if(numCorredores<lista.length) {
			lista[numCorredores++] = corredor;
		}
	}
	
	public void mostrarLista(Corredor [] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null)
				System.out.println(lista[i]);
		}
		
	}
	
	public Corredor buscarPorDorsal(int dorsalBusq) {
		boolean encontrado = false;
		int contador = 0;
		while(contador < numCorredores && !encontrado) {
			if(lista[contador].getDorsal()==dorsalBusq)
				encontrado = true;
			else
				contador++;
		}
		if(encontrado)
			return lista[contador];
		else
			return null;
	}
	
	public Corredor [] buscarVet() {
		Corredor [] listaNueva = new Corredor[numCorredores];
		int contador = 0;
		while(contador<numCorredores) {
			if(lista[contador] != null) {
				if(lista[contador].getCategoria()==3) {
					listaNueva[contador] = lista[contador];
				}
			}
			contador++;
		}
		return listaNueva;
	}
	

		
	
	
	

}
