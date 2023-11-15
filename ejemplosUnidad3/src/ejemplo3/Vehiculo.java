package ejemplo3;

public class Vehiculo {

	private String nombre;
	private double precio;
	private int numRuedas;
	
	public Vehiculo(String nombre,double precio,int numRuedas) {
		
		this.nombre=nombre;
		this.precio=precio;
		this.numRuedas=numRuedas;
		
	}
	
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas=numRuedas;
	}
	
	
	
}
