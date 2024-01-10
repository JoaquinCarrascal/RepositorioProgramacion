package ejercicio2;

public class TarjetaDeVisita extends Documento{

	private String datosPersonaDeContacto;

	public TarjetaDeVisita(String nombreEmpresa, String direccionEmpresa, String nombreCEO,
			String datosPersonaDeContacto) {
		super(nombreEmpresa, direccionEmpresa, nombreCEO);
		this.datosPersonaDeContacto = datosPersonaDeContacto;
	}

	public String getDatosPersonaDeContacto() {
		return datosPersonaDeContacto;
	}

	public void setDatosPersonaDeContacto(String datosPersonaDeContacto) {
		this.datosPersonaDeContacto = datosPersonaDeContacto;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [datosPersonaDeContacto=" + datosPersonaDeContacto + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println("El nombre de la persona de contacto en la empresa es:\n"
						 + "datosPersonaDeContacto");
	}
	
}
