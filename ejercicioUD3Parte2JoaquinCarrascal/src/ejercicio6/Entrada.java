package ejercicio6;

public class Entrada 
{

	private int iD;
	private double precio;
	private boolean ocupacion;
	private int filai;
	private int columnaj;
	
	public Entrada(double precio, boolean ocupacion) {
		this.precio = precio;
		this.ocupacion = ocupacion;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getFilai() {
		return filai;
	}

	public void setFilai(int filai) {
		this.filai = filai;
	}

	public int getColumnaj() {
		return columnaj;
	}

	public void setColumnaj(int columnaj) {
		this.columnaj = columnaj;
	}

	@Override
	public String toString() {
		return "Entrada [iD=" + iD + ", precio=" + precio + ", ocupacion=" + ocupacion + ", filai=" + filai
				+ ", columnaj=" + columnaj + "]";
	}

}
