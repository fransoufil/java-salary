package services;

import entities.Employee;

public class SalaryService {
	
	PensionService pensionService = new PensionService();
	TaxService taxService = new TaxService();
	
	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()
				- pensionService.pension(employee.getGrossSalary()));
	}

}
