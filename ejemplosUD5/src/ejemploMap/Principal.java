package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {
	
public static void main(String[] args) {
	//hashmap , treemap 
		
	Map <String, String> myMap = new HashMap <>();
	Set <String> setClave = myMap.keySet();
	Map <Integer , Alumno> mapaAlumno = new HashMap <>();
	//Set <Entry<Integer, Alumno>>setEntry1 = myMap.entrySet();
			
	
	myMap.put("Uno", "One");
	myMap.put("Dos", "Two");
	myMap.put("Tres", "Three");
	myMap.put("Cuatro", "Four");
	myMap.put("Cinco", "Five");		 //La segunda pisa a la primera porque no se pueden
	myMap.put("Cinco", "Sinco Pabo");// guardar claves duplicadas
	
	mapaAlumno.put(1, new Alumno (9.5,137,"Joaquín Carrascal Franco"));
	
	System.out.println(myMap);
	System.out.println(setClave);
	
	Collection listaValores = myMap.values();
	System.out.println(listaValores);
	
	System.out.println(mapaAlumno);
			
	
		
	}

}
