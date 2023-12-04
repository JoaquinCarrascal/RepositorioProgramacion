package ejercicio1;

public class Piso {

	private int direccion;
	private int m2;
	private int estado;
	private double precioVenta;
	private double pVP;

	public Piso(int m2, int estado, double precioVenta) {
		this.m2 = m2;
		this.estado = estado;
		this.precioVenta = precioVenta;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getpVP() {
		return pVP;
	}

	public void setpVP(double pVP) {
		this.pVP = pVP;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", m2=" + m2 + ", estado=" + estado + ", precioVenta=" + precioVenta
				+ ", PvP= " + pVP + "]";
	}

}
