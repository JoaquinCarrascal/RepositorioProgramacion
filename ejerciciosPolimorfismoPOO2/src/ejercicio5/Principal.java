package ejercicio5;

public class Principal {

	public static void main(String[] args) 
	{
	
		int tope = 10;
		Empleado [] listado = new Empleado[tope];
		Empleado e1 = new Empleado("Juan","Martinez",2000,134);
		Empleado e2 = new Vendedor("Pepe","Botika",2200,114,4000,14,500);
		//(cantidad de ventas,incentivo,tope de ventas)
		Empleado e3 = new Vendedor("Roberto","Iniesta",2100,7,3000,10,7000);
		Empleado e4 = new Gerente("Miguel","Benitez",5000,104,20);
		Empleado e5 = new Gerente("Ray","Heredia",4000,12,5);
		
		Oficina of1 = new Oficina(listado);
		of1.agregarEmpleado(e1);
		of1.agregarEmpleado(e2);
		of1.agregarEmpleado(e3);
		of1.agregarEmpleado(e4);
		of1.agregarEmpleado(e5);
		
		Impresion.imprimirLista(of1);
		

	}

}
