package ejercicio2;

import java.util.List;

public class Operacion {

	public List <String> ordenarCadena(List <String> listado){
		
		return listado.stream().sorted().toList();
		
	}
	
	public String buscarCadena(List <String> listado , String cadena) {
		
		return listado.stream().filter(x -> x.equalsIgnoreCase(cadena)).toString();
		
	}
	
	
	
	
	
}
