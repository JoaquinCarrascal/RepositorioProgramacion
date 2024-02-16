package trabajo_investigacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Principal {
	public static void main(String[] args) {
		
		var texto = "Hola mundo"; //el compilador entiende que esto es un String
		var texto2 = 23;//entiende que esto es un int
		var texto3 = 10;
		var texto4 = 4L; //con esta L le hemos dejado una pista de que este 4 es un Long
		var auxiliar = 0.0;
		//var auxiliar; //la variable ha de estar inicializada de lo contrario no puede funcionar
		String regex = "[abc]";
		Pattern.compile(regex,Pattern.UNICODE_CASE);
		
		
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

