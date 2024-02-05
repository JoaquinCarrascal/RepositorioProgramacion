package ejercicio1;

public class Nota {

	private String cuerpo;
	private int id;
	private String titulo;
	
	public Nota(String cuerpo, int id, String titulo) {
		this.cuerpo = cuerpo;
		this.id = id;
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Nota [cuerpo=" + cuerpo + ", id=" + id + ", titulo=" + titulo + "]";
	}
	
	
	
}
