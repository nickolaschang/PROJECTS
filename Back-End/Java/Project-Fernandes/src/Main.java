import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employees employee = new Employees();
		
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		employee.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario: " + employee.name + ", $ " + employee.netSalary() + "\n");
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double total = employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: ");
		System.out.printf("Funcionario: " + employee.name + ", $ " + total + "\n");
		
		
		sc.close();
		
	}
}