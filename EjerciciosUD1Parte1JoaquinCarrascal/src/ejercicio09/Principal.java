package ejercicio09;

public class Principal {

	public static void main(String[] args) 
	{

		double navas = 1500;
		double teatro = 600;
		double campNou = 65000;
		double navasCamp = 0;
		double navasTeatro = 0;
		
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Hola buenas, este programa sirve para medir aforos en una medida propia, "
				       + "\nlas mide en Navas, teniendo en cuenta que 1 Navas = 1500 personas");
		System.out.println("-------------------------------------------------------------------------");
		
		navasCamp = campNou / navas;
		navasTeatro = teatro / navas;
		System.out.printf("Podríamos afirmar por consiguiente que:\n"
				         + "Al concierto de U2 del Camp Nou asistieron: %.2f Navas.\n"
				         + "En el teatro Pastora Soler de Coria del Río caben: %.2f Navas.\n",navasCamp,navasTeatro);
		System.out.println("                                --.--                                    ");
		System.out.println("                  Gracias por usar el programa :):");
		System.out.println("-------------------------------------------------------------------------");
	}

}
