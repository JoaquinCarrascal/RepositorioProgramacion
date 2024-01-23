package ejercicio6;

public class CuentaCorriente extends Cuenta{
	
	private int puntos;
	private double cuotaManten;
	
	public CuentaCorriente(double saldo, String nombreProp, String numCuenta, double cuotaManten) {
		super(saldo, nombreProp, numCuenta);
		this.cuotaManten = cuotaManten;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public double getCuotaManten() {
		return cuotaManten;
	}

	public void setCuotaManten(double cuotaManten) {
		this.cuotaManten = cuotaManten;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [puntos=" + puntos + ", cuotaManten=" + cuotaManten + "]" + super.toString();
	}

	@Override
	public double ingresarSaldo(double cantidad) {
		if(cantidad > 0) {
		super.setSaldo(getSaldo()+cantidad);
		puntos++;
		}
		return super.getSaldo();
	}

	@Override
	public double retirarSaldo(double cantidad) {
		if(cantidad+cuotaManten <= super.getSaldo()) {
			super.setSaldo(super.getSaldo()-(cantidad+cuotaManten));
			puntos++;
		}
		return super.getSaldo();
	}
	
	
	

	
	
}
