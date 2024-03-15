package ejemplo1;

public class Principal {

	public static void main(String[] args) {

		int num = 10;
		int cero = 0;
		double res = 0;
		
		try {
		
		res = num / cero;
		
		}catch(Exception e) {
			
			System.out.println("Chunguele colega, ¿¿por cero enserio??");
			
		}
		
		System.out.printf("La división es: %.2f",res);

	}

}
