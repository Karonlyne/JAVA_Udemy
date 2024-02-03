import java.util.Scanner;
public class Aumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Double a , b, c, salario, a1, b1, c1, d1;
		a = 1000.00;
		b = 3000.00;
		c = 8000.00;
		System.out.println("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		a1 = salario * 20 / 100;
		b1 = salario * 15 / 100;
		c1 = salario * 10 / 100;
		d1 = salario * 5 / 100;
		
		if (salario <= a){
			System.out.println("Novo salario = R$ " + (salario + a1));
			System.out.println("Aumento = R$ " + a1);
			System.out.println("Porcentagem = " + (a1 / salario * 100) + " %");
		}
		else if (salario > a && salario <= b){
			System.out.println("Novo salario = R$ " + (salario + b1));
			System.out.println("Aumento = R$ " + b1);
			System.out.println("Porcentagem = " + (b1 / salario * 100) + " %");
		}
		else if (salario > b && salario <= c){
			System.out.println("Novo salario = R$ " + (salario + c1));
			System.out.println("Aumento = R$ " + c1);
			System.out.println("Porcentagem = " + (c1 / salario * 100) + " %");
		}
		else if (salario > c){
			System.out.println("Novo salario = R$ " + (salario + d1));
			System.out.println("Aumento = R$ " + d1);
			System.out.println("Porcentagem = " + (d1 / salario * 100) + " %");
		}

		
		
	}

}
