package ejercicio2;

public class Producto implements IImpuesto{

	@Override
	public double calculoIva(double precio, int iva) {
		double cien = 100;
		return precio + precio * iva/cien;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
