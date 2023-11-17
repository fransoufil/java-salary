package services;

public class TaxService {
	
	public double tax(double amount) {
		double val = amount * 0.02;
		System.out.printf("Tax do funcionario = %.2f%n", val);
		return val;
	}

}
