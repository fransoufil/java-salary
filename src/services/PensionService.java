package services;

public class PensionService {
	
	public double discount(double amount) {
		double val = amount * 0.1;
		System.out.printf("Pension do funcionario = %.2f%n", val);
		return val;
	}

}
