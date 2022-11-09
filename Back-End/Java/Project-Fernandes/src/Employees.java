public class Employees {
	public String name;
	public double grossSalary, imposto, porcentage;
	
	public double netSalary() {
		return grossSalary - imposto;
	}
	public double increaseSalary(double amount) {
		return (amount * grossSalary) / 100 + netSalary();
	}
	
}