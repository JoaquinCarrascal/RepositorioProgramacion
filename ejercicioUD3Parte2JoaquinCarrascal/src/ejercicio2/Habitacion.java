package ejercicio2;

public class Habitacion {

	private String tipo;
	private boolean extra;
	private double precio;
	private String clienteAsig;
	private int diasAlq;
	private boolean limpieza;
	private boolean alquilada;
	private int iD;
	
	public Habitacion(String tipo, double precio, boolean limpieza) {
		this.tipo = tipo;
		this.precio = precio;
		this.limpieza = limpieza;
		this.alquilada = false;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isExtra() {
		return extra;
	}

	public void setExtra(boolean extra) {
		this.extra = extra;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getClienteAsig() {
		return clienteAsig;
	}

	public void setClienteAsig(String clienteAsig) {
		this.clienteAsig = clienteAsig;
	}

	public int getDiasAlq() {
		return diasAlq;
	}

	public void setDiasAlq(int diasAlq) {
		this.diasAlq = diasAlq;
	}

	public boolean isLimpieza() {
		return limpieza;
	}

	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}

	public boolean isAlquilada() {
		return alquilada;
	}

	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", extra=" + extra + ", precio=" + precio + ", clienteAsig=" + clienteAsig
				+ ", diasAlq=" + diasAlq + ", limpieza=" + limpieza + ", alquilada=" + alquilada + ", iD=" + iD + "]";
	}
	
	
	
	
}
