package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		TaxPayer taxPayer = new TaxPayer();

		System.out.print("Quantos contribuintes voce vai digitar? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com salario: ");
			double rendaAnualSalario = sc.nextDouble();
			System.out.print("Renda anual com prestacao de servico: ");
			double rendaAnualServico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double rendaAnualCapital = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double gastosMedicos = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double gastosEducacionais = sc.nextDouble();

			taxPayer = new TaxPayer(rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos,
					gastosEducacionais);
			list.add(taxPayer);
			System.out.println();
		}

		for (int i = 0; i < list(list, i); i++) {
			System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
			System.out.println(taxPayer.grossTax());
			System.out.println(taxPayer.taxRebate());
			System.out.println(taxPayer.netTax());
			System.out.println();
		}

		sc.close();
	}

	public static Integer position(List<TaxPayer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
