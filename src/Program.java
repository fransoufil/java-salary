import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do funcionario: ");
		String name = sc.nextLine();
		
		System.out.println("Salario bruto do funcionario: ");
		double grossSalary = sc.nextDouble();
		
		sc.close();
	}

}
