package ejercicio6;

public abstract class Cuenta {

	private double saldo;
	private String nombreProp;
	private String numCuenta;
	
	public Cuenta(double saldo, String nombreProp, String numCuenta) {
		this.saldo = saldo;
		this.nombreProp = nombreProp;
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreProp() {
		return nombreProp;
	}

	public void setNombreProp(String nombreProp) {
		this.nombreProp = nombreProp;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", nombreProp=" + nombreProp + ", numCuenta=" + numCuenta + "]";
	}
	
	public abstract double ingresarSaldo(double cantidad);
	
	public abstract double retirarSaldo(double cantidad);
	
	
	
	
}
