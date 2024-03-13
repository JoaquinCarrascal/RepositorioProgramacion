package ejercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Secretaria {
	
	private List <Alumno> listado;

	public Secretaria(List<Alumno> listado) {
		this.listado = listado;
	}

	public List<Alumno> getListado() {
		return listado;
	}

	public void setListado(List<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Secretaria [listado=" + listado + "]";
	}
	
	public void agregarAlumno (Alumno a) {
		listado.add(a);
	}
	
	public void imprimirListado(List <Alumno> l) {
		
		l.stream().forEach(System.out::println);
		
	}
	
	public List <Alumno> filtradoPorNombre(String nombre){
		
		return listado.stream()
				.filter( x -> x.getNombre().equalsIgnoreCase(nombre))
				.collect(Collectors.toList());
	
	}
	
	public List <Alumno> filtradoPorLetra(String letra){
		
		return listado.stream()
				.filter(x -> x.getNombre().startsWith(letra))
				.toList();
	
	}
	
	public long cantidadAlumnos() {
		
		return this.listado.stream().count();
				
	}
	
	public List <Alumno> filtradoPorNotaMedia(double tope){
		
		return listado.stream()
				.filter(x ->( x.getNotaMedia() > tope ))
				.toList();
	
	}
	
	public void mostrarPrimeros(int tope) {
		
		listado.stream()
			.limit(tope)
			.forEach(System.out::println);
		
	}
	
	public Alumno filtradoPorMasJoven(){
		
		return listado.stream()
					.min(Comparator.comparing(Alumno::getEdad))
					.get();
	
	}
	
	public Alumno buscarPrimeroLista(){
		
		return listado.stream()
					.findFirst()
					.get();
	
	}
	
	public List <Alumno> buscarNombreLargo(int tope){
		
		return listado.stream()
				.filter(x -> x.getNombre().length() > tope)
				.toList();
		
	}
	
	public List <Alumno> buscarLetraLongitud(String letra,int tope){
		
		return listado.stream()
				.filter(x -> x.getNombre().startsWith(letra))
				.filter(x -> x.getNombre().length() <= tope)
				.toList();
		
	}

}
