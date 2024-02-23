package ejemplo_completo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
	
	/*
	 
	  Al comienzo del mes de agosto despegó desde la Tierra y con Alpha Centauri como 
	  coordenada de destino la primera misión espacial que pretendía explorar los 
	  confines de nuestra galaxia, decidieron escogerte a ti, un novato cosmonauta 
	  que lo único que tenía de especial con respecto sus compañeros era la habilidad de 
	  programar en Java, no hubiesen creído que esta cualidad sería precisamente 
	  la que les salvaría la vida a estos surcadores del espacio,fue a 1 año luz del 
	  comienzo del recorrido que una señal extraña impacta en los sensores de la 
	  nave, esta señal es sumamente complicada de interpretar pero por la frecuencia en la 
	  que llega a la nave comprendes que es una señal proveniente de una forma de 
	  vida inteligente, el único ordenador que hay libre en la nave tiene casualmente 
	  el IDE de Eclipse, y ves la salvación, harás un programa en Java que por medio 
	  de expresiones regulares consiga descifrar qué es lo que tratan de comunicar 
	  estos seres, ¡recuerda! eres el único capaz de entender Java, debes crear un 
	  programa que pueda ser usado por cualquier tripulante, se necesita una función 
	  que reciba una cadena de caracteres encriptada y devuelva un mensaje en limpio, 
	  un input podría ser el siguiente:

	  &%&%$!Somos&%·la=)·policia$%)intergalactica=(/%habeis%$!/)=hecho)/(%un&$$sinpa$$en=))))la”###ultima(&)gasolinera)&%·interestelar/·$!  
	  (Pruébese con éste).

	  Al ver el comandante de la nave lo entretenido que estabas picando código, 
	  te pide que incluyas en las opciones del menú la posibilidad de agregar 
	  tripulantes para tener una lista de personal ya que al ser una misión tan 
	  larga vuestra descendencia podría ocupar un cargo abordo y gustaría guardar 
	  esos datos, se debe poder diferenciar entre dos tipos de tripulantes, el de 
	  exterior (que realizan trabajos fuera de la nave) de los cuales interesa saber 
	  código de licencia de operario que tiene, y de interior, de ellos nos interesa 
	  saber , su talla de pijama espacial(es su uniforme), el comandante te pide que 
	  tenga posibilidad de agregar tripulantes, eliminarlos, calcular el salario de 
	  un tripulante con su costo por hora y sus horas de trabajo (en petit comité te 
	  confiesa que los tripulantes de interior cobraban un porcentaje menor, que 
	  convendría que fuese introducido por teclado para que no quedase constancia 
	  de cuánto menos les pagaba) , calcular el gasto de todos los tripulantes de 
	  la nave y la posibilidad de buscar a un tripulante para darle un consejo 
	  para su jornada, como remate, te pide que los guardes usando la interfaz 
	  Set (con ésto último se confirma que es un auténtico genio de la comedia).
	  Impaciente, te pide que agregues también algún tripulante de prueba para probar 
	  el programa él mismo.

	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Tripulante> listado = new HashSet<>();// no hace falta parametrizar el HashSet
													// porque le viene inferido del Set
		CRUDTripulante cT1 = new CRUDTripulante(listado);

		var regex = "\\w+"; //ésta regex hace referencia a una 
							//cadena de caracteres y acepta también '_'
		var regexTalla = "(XS|S|M|L|XL|XXL)";
		int casoMenu = 0, casoSalida = 0,cero = 0,casoSubMenu = 0;
		String aux,nombre,idTripulante,codLicencia,talla;
		Double precioXHora,horasTrabajadas,descuento;
		
		Pattern miPatron = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Matcher cadenaBusqueda;
		// nombre, sueldoXHora, horasTrabajadas, idTripulante,codigoLicencia o talla
		// éstos tripulantes están añadidos únicamente para tener algo con que probar el programa.
		// no son tripulantes reales, si fuese el caso, el programa estaría mejor hecho
		Tripulante t1 = new TripulanteExterior("Jesus Casanova", 15, 120, "JC2000RJG", "ANSI");
		Tripulante t2 = new TripulanteExterior("Ángel Naranjo", 20, 150, "AN2200GHK", "XS/SPARC");
		Tripulante t3 = new TripulanteInterior("Luis Miguel López", 18, 90, "LML1900LOP", "M");
		Tripulante t4 = new TripulanteInterior("Miguel Campos", 16, 190, "MC4350POL", "M");

		cT1.agregarTripulante(t1);
		cT1.agregarTripulante(t2);
		cT1.agregarTripulante(t3);
		cT1.agregarTripulante(t4);

		System.out.println("Bienvenido a la interfaz del Apolo 11+1\n\n");
		do {
			System.out.println("\n1.- Desencriptador de mensajes\n"
							 + "2.- Agregar tripulante\n"
							 + "3.- Borrar tripulante\n"
							 + "4.- Calcular salario tripulante\n"
							 + "5.- Consultar gasto total en salarios\n"
							 + "6.- Dar consejo a tripulantes\n"
							 + "0.- Salir");
			
			aux = sc.nextLine();
			casoMenu = Integer.parseInt(aux);
			switch (casoMenu) {
			
			case 1:
				System.out.println("Introduzca el mensaje que quiere desencriptar y pulse intro:");
				cadenaBusqueda = miPatron.matcher(sc.nextLine());
				System.out.println("El mensaje dice así: ");
				while(cadenaBusqueda.find()) {
					System.out.print(cadenaBusqueda.group() + " ");
				}
				System.out.println();
				break;
				
			case 2:
	
				do {
					System.out.println("1.- Tripulante de exterior\n"
							 + "2.- Tripulante de interior\n"
							 + "0.- Para salir");
					
					aux = sc.nextLine();
					casoSubMenu = Integer.parseInt(aux);
					switch(casoSubMenu) {
					
					case 1:
						System.out.println("Introduzca nombre:");
						nombre = sc.nextLine();
						System.out.println("Introduzca salario por hora:");
						aux = sc.nextLine();
						precioXHora = Double.parseDouble(aux);
						System.out.println("Introduzca horas trabajadas:");
						aux = sc.nextLine();
						horasTrabajadas = Double.parseDouble(aux);
						System.out.println("Introduzca id:");
						//ESTO ES MALA IDEA Y NO SE DEBE HACER NUNCA PERO NO SABEMOS GENERAR IDs
						//LAS ID SE DEBEN GESTIONAR SIN INTERACCIÓN DEL USUARIO
						//ESTO ES UN EJEMPLO EDUCATIVO PERO QUIERO ACLARAR QUE TENGO CONOCIMIENTO DE LO QUE HAGO
						idTripulante = sc.nextLine();
						System.out.println("Introduzca codigo de la licencia que tenga:");
						codLicencia = sc.nextLine();
						cT1.agregarTripulante(new TripulanteExterior(nombre,precioXHora,horasTrabajadas,idTripulante,codLicencia));
						break;
						
					case 2:
						System.out.println("Introduzca nombre:");
						nombre = sc.nextLine();
						System.out.println("Introduzca salario por hora:");
						aux = sc.nextLine();
						precioXHora = Double.parseDouble(aux);
						System.out.println("Introduzca horas trabajadas:");
						aux = sc.nextLine();
						horasTrabajadas = Double.parseDouble(aux);
						System.out.println("Introduzca id:");
						//ESTO ES MALA IDEA Y NO SE DEBE HACER NUNCA PERO NO SABEMOS GENERAR IDs
						//LAS ID SE DEBEN GESTIONAR SIN INTERACCIÓN DEL USUARIO
						//ESTO ES UN EJEMPLO EDUCATIVO PERO QUIERO ACLARAR QUE TENGO CONOCIMIENTO DE LO QUE HAGO
						idTripulante = sc.nextLine();
						do {
						System.out.println("Introduzca la talla del pijama de abordo:");
						talla = sc.nextLine();
						if(talla.matches(regexTalla))
							cT1.agregarTripulante(new TripulanteInterior(nombre,precioXHora,horasTrabajadas,idTripulante,talla));
						else
							System.out.println("Talla no comprendida, ha de ser: XS , S , M , L , XL , XXL");
						}while(!talla.matches(regexTalla));
						break;
						
					case 0:
						System.out.println("Saliendo...");
						break;
						
					default:
						System.out.println("Opción no reconocida inténtelo de nuevo");
					}
					
				}while(casoSubMenu != casoSalida);
				
				break;
				
			case 3:
				
				System.out.println("Introduzca id del tripulante que quiera eliminar:");
				cT1.borrarTripulante(sc.nextLine());
				
				break;
				
			case 4:
				
				System.out.println("Introduzca el porcentaje de descuento ;).");
				aux = sc.nextLine();
				descuento = Double.parseDouble(aux);
				System.out.println("Introduzca id del tripulante que quiera calcular");
				System.out.printf("El sueldo es de: %.2f€.\n"
						,cT1.calcularSueldoGenerico(cT1.buscarXId(sc.nextLine()), descuento));
				
				break;
				
			case 5:
				
				System.out.printf("El total serían: %.2f€.\n",cT1.calcularGastoTotal(cero));
				
				break;
				
			case 6:
				
				System.out.println("Introduzca id del tripulante que quiera aconsejar.");
				cT1.consejoTripulante(sc.nextLine());
				
				break;
			
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
				default:
					System.out.println("Opción no reconocida inténtelo de nuevo");
			

			}
		} while (casoMenu != casoSalida);
		System.out.println("Gracias por usar el programa");
		sc.close();
	}

}
