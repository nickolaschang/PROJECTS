package entities;

public class TaxPayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer() {
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double monthlySalary = salaryIncome / 12;
		if (monthlySalary >= 3000.0 && monthlySalary <= 5000) {
			return salaryIncome * 0.10;
		} else if (monthlySalary > 5000.0) {
			return salaryIncome * 0.2;
		} else
			return salaryIncome / 12 * 0.0;
	}

	public double servicesTax() {
		return servicesIncome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.2;
	}

	public double grossTax() {
		return capitalTax() + servicesTax() + salaryTax();
	}

	public double taxRebate() {
		double maxDeductible = grossTax() * 0.3;
		double dueTax;
		double deductibleTaxes = healthSpending + educationSpending;
		if (grossTax() > maxDeductible) {
			return dueTax = grossTax() - deductibleTaxes;
		} else
			return dueTax = grossTax() - maxDeductible;
	}

	public double netTax() {
		return taxRebate();
	}

	public int getId() {
		
		return 0;
	}
}
