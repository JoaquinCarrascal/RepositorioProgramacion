package ejercicio6;

public class CuentaJoven extends Cuenta{

	private double cantidadRegalo;
	private double sumatorioRegalo;
	
	public CuentaJoven(double saldo, String nombreProp, String numCuenta, double cantidadRegalo) {
		super(saldo, nombreProp, numCuenta);
		this.cantidadRegalo = cantidadRegalo;
	}

	public double getCantidadRegalo() {
		return cantidadRegalo;
	}

	public void setCantidadRegalo(double cantidadRegalo) {
		this.cantidadRegalo = cantidadRegalo;
	}

	public double getSumatorioRegalo() {
		return sumatorioRegalo;
	}

	public void setSumatorioRegalo(double sumatorioRegalo) {
		this.sumatorioRegalo = sumatorioRegalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [cantidadRegalo=" + cantidadRegalo + ", sumatorioRegalo=" + sumatorioRegalo + "]" + super.toString();
	}

	@Override
	public double ingresarSaldo(double cantidad) {
		if(cantidad > 0) {
		super.setSaldo(getSaldo()+cantidad+cantidadRegalo);
		sumatorioRegalo += cantidadRegalo;
		}
		return super.getSaldo();
	}

	@Override
	public double retirarSaldo(double cantidad) {
		if(cantidad <= super.getSaldo()) {
			super.setSaldo(super.getSaldo()-cantidad);
		}
		return super.getSaldo();
	}
	
	
	
	
}
