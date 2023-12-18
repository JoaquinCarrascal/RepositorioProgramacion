package ejemplo1;

public class Producto {

	private String nombreProd;
	private double precFabr;
	private double pVP;
	private int seccion;
	private boolean enVenta;
	private int iD;
	
	public Producto(String nombreProd, double precFabr, int seccion, boolean enVenta) {
		this.nombreProd = nombreProd;
		this.precFabr = precFabr;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}
	public Producto(int iD,String nombreProd, double precFabr, int seccion, boolean enVenta) {
		this.iD=iD;
		this.nombreProd = nombreProd;
		this.precFabr = precFabr;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}
	public Producto() {
		
	}
	
	public String getNombreProd() {
		return nombreProd;
	}
	
	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public double getPrecFabr() {
		return precFabr;
	}

	public void setPrecFabr(double precFabr) {
		this.precFabr = precFabr;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public double getpVP() {
		return pVP;
	}
	public void setpVP(double pVP) {
		this.pVP = pVP;
	}
	
	@Override
	public String toString() {
		return "Producto [nombreProd=" + nombreProd + ", precFabr=" + precFabr + ", seccion=" + seccion + ", enVenta="
				+ enVenta + "]";
	}
	
	
	
}
