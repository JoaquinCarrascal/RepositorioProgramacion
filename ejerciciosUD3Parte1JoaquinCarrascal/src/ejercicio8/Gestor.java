package ejercicio8;

public class Gestor 
{

	private String accountHolder;
	private double reservoir;
	
	public Gestor(String accountHolder, double reservoir) {
		this.accountHolder = accountHolder;
		this.reservoir = reservoir;
	}

	public String getaccountHolder() {
		return accountHolder;
	}

	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getreservoir() {
		return reservoir;
	}

	public void setreservoir(double reservoir) {
		this.reservoir = reservoir;
	}
	
	public void depositCurrency(double currency) {
		
		this.reservoir+=currency;
		
	}
	
	public void withdrawCurrency(double currency) {
		
		if(reservoir>currency)
			this.reservoir -= currency;
		
	}
	
	public double calculateCurrency(double equivalence,double quantity) {
		
		return quantity * equivalence;
		
	}
	
	
}
