package ejercicio4;

public class LineaDeVenta {

	private Producto prod;
	private int cantidad;
	private double subtotal; //no suele ser un atributo porque no cuesta este calculo
	
	public LineaDeVenta(Producto prod, int cantidad) {
		this.prod = prod;
		this.cantidad = cantidad;
	}

	public Producto getProd() {
		return prod;
	}

	public void setProd(Producto prod) {
		this.prod = prod;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	@Override
	public String toString() {
		return "prod= " + prod + " cantidad= " + cantidad + " subtotal= " + subtotal;
	}
	
	public String imprimirLinea() {
		return "Producto = "+ prod.getNombre() + " cantidad = " + cantidad + " subtotal = " + subtotal;
	}

	public double calcularPVPGeneral() {
		return prod.calcularPVP();
	}
	
	public double calcularSubtotal() {
		setSubtotal(calcularPVPGeneral() * cantidad);
		return subtotal;
		
	}
	
	
}
