package imposto;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Renda anual com salario: R$");
		double rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestacao de servico: R$");
		double rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho capital: R$");
		double rendaCapital = sc.nextDouble();
		System.out.print("Gastos medicos: R$");
		double gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educaionais: R$");
		double gastosEducacionais = sc.nextDouble();

		double rendaMensalSalario = rendaSalario / 12;
		double impostoSalario;
		double impostoServico = rendaServico * 0.15;
		double impostoCapital = rendaCapital * 0.20;

		if (rendaMensalSalario >= 3000.0 && rendaMensalSalario <= 5000) {
			impostoSalario = rendaSalario * 0.10;
		} else if (rendaMensalSalario > 5000.0) {
			impostoSalario = rendaSalario * 0.2;
		} else
			impostoSalario = 0.0;

		System.out.println();
		System.out.println("RELATORIO DE IMPOSTO DE RENDA");
		System.out.println();

		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salario: R$ %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre servicos: R$ %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", impostoCapital);
		System.out.println();

		double impostoBruto = impostoSalario + impostoServico + impostoCapital;
		double maximoDedutivel = impostoBruto * 0.3;
		double gastosDedutiveis = gastosMedicos + gastosEducacionais;

		System.out.println("DEDUCOES: ");
		System.out.printf("Maximo dedutivel: R$ %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutiveis: R$ %.2f%n", gastosDedutiveis);
		System.out.printf("");

		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
		System.out.printf("Abatimento: R$ %.2f%n", maximoDedutivel);

		double impostoDevido = 0;
		if (impostoBruto > gastosDedutiveis) {
			impostoDevido = impostoBruto - gastosDedutiveis;
		} else
			impostoDevido = impostoBruto - maximoDedutivel;

		System.out.printf("Imposto Devido: R$ %.2f%n", impostoDevido);

		sc.close();
	}

}
