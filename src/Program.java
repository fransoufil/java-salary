import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import services.SalaryService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionario: ");
		String name = sc.nextLine();
		
		System.out.println("Salario bruto do funcionario: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		SalaryService salaryService = new SalaryService();
		
		double netSalary = salaryService.netSalary(employee);
		
		System.out.printf("Salario liquido do funcionario = %.2f%n", netSalary);
		
		sc.close();
	}

}
