package ejemploPolimorfismo;

public abstract class Figura {
	private String nombre, color;

	public Figura() {
	}

	public Figura(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void metodoSoloDeFigura () {
		System.out.println("Éste método sólamente forma parte de la clase figura");
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
}
