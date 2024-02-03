package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentagem) {
		this.grossSalary = (grossSalary + grossSalary*(porcentagem/100)) - tax;
	}
	
	public String dadosfuncionario() {
		return "Funcionário: "
				+ name
				+ ", $ "
				+ String.format("%.2f%n", netSalary());
	}
	
	public String newdados() {
		return "Dados atualizados: "
				+ name
				+ ", $ "
				+ String.format("%.2f", grossSalary);
	}
}
