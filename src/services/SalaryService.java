package services;

import entities.Employee;

public class SalaryService {
	
	PensionService pensionService = new PensionService();
	TaxService taxService = new TaxService();
	
	public double netSalary(Employee employee) {
		
		double totalDiscount = taxService.tax(employee.getGrossSalary())
				+ pensionService.discount(employee.getGrossSalary());
		return employee.getGrossSalary() - totalDiscount;
	}

}
