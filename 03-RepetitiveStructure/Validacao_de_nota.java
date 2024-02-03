import java.util.Scanner;

public class Validacao_de_nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota:");
		double x = sc.nextDouble();
		
		if ((x >= 0) && (x <= 10)) {
			System.out.println("Digite a segunda nota:");
		} else {
			while ((x < 0) || (x > 10)) {
				System.out.println("Valor invalido! Tente novamente:");
				x = sc.nextDouble();
			}
			System.out.println("Digite a segunda nota:");
		}
		
		double y = sc.nextDouble();
		
		if ((y >= 0) && (y <= 10)) {
			Double media = (x + y)/2;
			System.out.println("MEDIA = "+media);
		} else {
			while ((y < 0) || (y > 10)) {
				System.out.println("Valor invalido! Tente novamente:");
				y = sc.nextDouble();
			}
			Double media = (x + y)/2;
			System.out.println("MEDIA = "+media);
		}
				
		sc.close();	
	}

}

/*
Scanner sc = new Scanner(System.in);

System.out.print("Digite a primeira nota: ");
double x = sc.nextDouble();

while (x < 0 || x > 10) {
	System.out.print("Valor invalido! Tente novamente: ");
	x = sc.nextDouble();
}

System.out.print("Digite a segunda nota: ");
double y = sc.nextDouble();

while (y < 0 || y > 10) {
	System.out.print("Valor invalido! Tente novamente: ");
	y = sc.nextDouble();
}

System.out.printf("MEDIA = %.2f", (x + y) / 2 );

sc.close();
*/