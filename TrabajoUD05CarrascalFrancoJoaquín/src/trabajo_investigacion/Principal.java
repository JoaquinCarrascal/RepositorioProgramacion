package trabajo_investigacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
	public static void main(String[] args) {
		
		var texto = "Hola mundo"; //el compilador entiende que esto es un String
		var texto2 = 23;//entiende que esto es un int
		var texto3 = 10;
		var texto4 = 4L; //con esta L le hemos dejado una pista de que este 4 es un Long
		var auxiliar = 0.0;
		//var auxiliar; //la variable ha de estar inicializada de lo contrario no puede funcionar
		String regex = "[a-z ]+";
		
		Pattern miPatron = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		Matcher cadenaBusqueda = miPatron.matcher("Hola buenas a todos.");
		
		while(cadenaBusqueda.find()) {
			System.out.println("Encontrado: " + cadenaBusqueda.group());
		}
		
		String patronTest2 = ".*[a-z ]+.*";
		String cadenaTest2 = "&&%hola&&caracola";
		Boolean encontradoBoolean = cadenaTest2.matches(patronTest2);
		System.out.println("¿Hay palabras en la cadena entregada? : " + encontradoBoolean);
				
		 Pattern myPattern = Pattern.compile("([a-zA-Z0-9._%-]+)@([a-zA-Z0-9.-]+).([a-zA-Z]{2,6})");
		 Matcher myMatcher = myPattern.matcher("=&$/·!triana@salesianos.edu)=%·!!!!·$%%%");
		 while (myMatcher.find()) {
		    	System.out.println("Encontrado: " + myMatcher.group());
		 }
		
		Set <Persona> listadoTest = new HashSet<Persona>();
		
		List <Persona> listado = new ArrayList</*no hace falta poner Persona aqui*/>();
		
		//var saludo = "hola";
		//saludo = 123L;  //no es posible
		
		
		//aqui un pequeño test
		System.out.println(texto);
		
		auxiliar = texto2 + texto3;
		System.out.println(texto2 + " + " + texto3 + " = " + auxiliar);
		
		System.out.println(texto4);
		System.out.println(listado);
		System.out.println(listadoTest);
		
	}
	
}

