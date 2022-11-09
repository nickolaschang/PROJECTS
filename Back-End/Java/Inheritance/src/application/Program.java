package application;

import entities.Adress;
import entities.Department;
import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Departamento: ");
        String departmentName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int departmentPayDay = sc.nextInt();

        sc.nextLine();

        System.out.print("Email: ");
        String addressEmail = sc.nextLine();

        System.out.print("Telefone: ");
        String addressPhone = sc.nextLine();

        Department department = new Department(departmentName, departmentPayDay);
        Adress address = new Adress(addressEmail, addressPhone);

        System.out.print("Quantos funcionarios tem o departamento? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Dados do funcionario #" + (i + 1) + ":");

            System.out.print("Nome: ");
            sc.nextLine();
            String employeeName = sc.nextLine();

            System.out.print("Salario: ");
            double employeeSalary = sc.nextDouble();

            department.addEmployee(new Employee(employeeName, employeeSalary));
        }

        System.out.println();

        System.out.println("FOLHA DE PAGAMENTO: ");

        System.out.println("Departamento " + department.getName() + " = R$" + String.format("%.2f", department.payroll()));

        System.out.println("Pagamento realizado no dia: " + department.getPayDay());

        System.out.println("Funcionarios: ");

        for (int i = 0; i < department.getEmployeeList().size(); i++) {
            System.out.println(department.getEmployeeList().get(i).getName());
        }

        System.out.println("Para duvidas favor entrar em contato: " + address.getEmail() + " ou pelo nosso telefone: "
                + address.getPhone());

        sc.close();
    }
}
