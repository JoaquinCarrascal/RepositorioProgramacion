package ejercicio6;

public class Principal {

	public static void main(String[] args) 
	{
	
		int tam = 10;
		
		Cuenta [] listado = new Cuenta[tam];
		
		Cuenta c1 = new CuentaCorriente(2000,"Pepe Botika","23RT0",0.85);
		Cuenta c2 = new CuentaCorriente(3000,"Roberto Iniesta","15HT1",2);
		Cuenta c3 = new CuentaJoven(3700,"Joaquin Carrascal","57GT1",1);
		Cuenta c4 = new CuentaJoven(1200,"Jose de Estopa","931ER",1);
		Cuenta c5 = new CuentaEmpresa(39000,"NTT Data","315AFG",1);
		
		Oficina of1 = new Oficina(listado);
		
		of1.agregarCuenta(c1);
		of1.agregarCuenta(c2);
		of1.agregarCuenta(c3);
		of1.agregarCuenta(c4);
		of1.agregarCuenta(c5);

	}

}
