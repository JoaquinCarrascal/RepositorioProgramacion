package ejercicio2;

public class Documento {

	private String nombreEmpresa;
	private String direccionEmpresa;
	private String nombreCEO;
	
	public Documento(String nombreEmpresa, String direccionEmpresa, String nombreCEO) {
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.nombreCEO = nombreCEO;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getNombreCEO() {
		return nombreCEO;
	}

	public void setNombreCEO(String nombreCEO) {
		this.nombreCEO = nombreCEO;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", direccionEmpresa=" + direccionEmpresa + ", nombreCEO="
				+ nombreCEO + "]";
	}
	
	public void imprimirDocumento() {
		System.out.println("Nombre de la Empresa: " + nombreEmpresa + 
						   "\nDirección de la Empresa: " + direccionEmpresa + 
						   "\nNombre del dueño: " + nombreCEO);
	}
	
}
