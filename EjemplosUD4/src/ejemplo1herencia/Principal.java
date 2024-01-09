package ejemplo1herencia;

public class Principal {

	public static void main(String[] args) 
	{

		Trabajador t1 = new Trabajador("juan","jefe","45994124E");
		
		Empleado e1 = new Empleado("pepe","jefe de ciberseguridad","45564124N",3400,15);
		
		Empleado e2 = new Empleado("45996467D",2340,5);
		
		System.out.println(t1);
		System.out.println(e1);
		System.out.println(e2);
		
		
		
	}

}
