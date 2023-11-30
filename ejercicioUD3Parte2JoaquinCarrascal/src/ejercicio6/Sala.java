package ejercicio6;

public class Sala 
{

	private int iDSala;
	private int localidades;
	private Entrada e;
	private Entrada [][] e2;
	private String nombrePelicula;
	
	public Sala(Entrada[][] e2,int iDSala, int localidades,String nombrePelicula) {
		this.e2 = e2;
		this.iDSala = iDSala;
		this.localidades = localidades;
		this.nombrePelicula = nombrePelicula;
	}

	public int getiDSala() {
		return iDSala;
	}

	public void setiDSala(int iDSala) {
		this.iDSala = iDSala;
	}

	public int getLocalidades() {
		return localidades;
	}

	public void setLocalidades(int localidades) {
		this.localidades = localidades;
	}

	public Entrada getE() {
		return e;
	}

	public void setE(Entrada e) {
		this.e = e;
	}

	public Entrada[][] getE2() {
		return e2;
	}

	public void setE2(Entrada[][] e2) {
		this.e2 = e2;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	
	
	public void mostrarInformacionSala() {
		System.out.println("Sala: "+iDSala+" proyectará "+ nombrePelicula);
	}
	
	public void rellenarSala(double precio) {
		Entrada e = new Entrada(precio,false);
		for (int i = 0; i < e2.length; i++) {
			for (int j = 0; j < e2[i].length; j++) {
				e2[i][j] = e;
			}
		}
	}
	
	public boolean comprarEntrada(int filai, int columnaj) {
		if(e2[filai][columnaj].isOcupacion())
			return true;
		else {
			e2[filai][columnaj].setOcupacion(true);
			return false;
		}
	}
	
}
