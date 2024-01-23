package ejercicio1;

public class Principal {

	public static void main(String[] args) 
	{
	
		Papeleria p1 = new Libro("Lo vi muerto y lo maté",1999,true);
		Papeleria p2 = new Libro("La bala de dobló la esquina",1650,false);
		Papeleria p3 = new Revista("Un charquito bajo el mar",1230,false);
		Papeleria p4 = new Revista("Vivo, que no es poco",2019,false);
		
		int tam = 4;
		
		Papeleria [] listado = new Papeleria[tam];
		listado[0] = p1;
		listado[1] = p2;
		listado[2] = p3;
		listado[3] = p4;
		
		GestionPapeleria gp1 = new GestionPapeleria();
		
		System.out.println("Hay " + gp1.contadorPrestados(listado) + " prestado.");
		System.out.println(gp1.publicacionesAnterioresA(listado,1980) + " se publicaron antes de 1980.");
		
	}

}
