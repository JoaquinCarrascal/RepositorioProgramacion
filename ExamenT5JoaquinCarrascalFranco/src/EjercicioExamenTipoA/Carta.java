package EjercicioExamenTipoA;

public class Carta implements Comparable <Carta>{

	private String nombre;
	private String palo;
	private int numCarta;
	
	public Carta(String nombre, String palo, int numCarta) {
		this.nombre = nombre;
		this.palo = palo;
		this.numCarta = numCarta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumCarta() {
		return numCarta;
	}

	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", numCarta=" + numCarta + "]";
	}
	
	public int valorCarta() {
		int uno = 1, tres = 3, diez = 10 ,once = 11,doce= 12;
		if(this.numCarta==uno)
			return 11;
		if(this.numCarta==tres)
			return 10;
		if(this.numCarta==diez)
			return 2;
		if(this.numCarta==once)
			return 3;
		if(this.numCarta==doce)
			return 4;
		else
			return 0;
	}

	@Override
	public int compareTo(Carta c2) {//orden natural
		return this.palo.compareToIgnoreCase(c2.getPalo());
	}
	
	
	
	
	
	
}
