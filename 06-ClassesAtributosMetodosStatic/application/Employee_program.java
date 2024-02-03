package application;

import java.util.Scanner;
import entities.Employee;

public class Employee_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Employee a = new Employee();
		
		System.out.print("Name: ");
		a.name = sc.nextLine();
		System.out.print("Salário bruto: ");
		a.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		a.tax = sc.nextDouble();
		
		System.out.println(a.dadosfuncionario());
		
		System.out.print("Qual a porcentagem para aumentar o salário: ");
		double porcentagem = sc.nextDouble();
		a.increaseSalary(porcentagem);
		
		System.out.println(a.newdados());
		
		sc.close();
	}

}
