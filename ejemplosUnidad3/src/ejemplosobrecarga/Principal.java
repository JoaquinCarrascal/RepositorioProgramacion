package ejemplosobrecarga;

public class Principal {

	public static void main(String[] args) 
	{

		Operaciones op1 = new Operaciones();
		
		System.out.println(op1.sumarDobles(2.2, 3.4));
		System.out.println(op1.sumarDobles(2, 3));
		
	}

}
