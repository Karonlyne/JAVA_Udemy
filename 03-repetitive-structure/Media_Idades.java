import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as idades:");
		int x = sc.nextInt();
		
		if (x>0) {
			int contador = 0;
			double soma = 0;
			
			while (x > 0) {
				contador += 1;
				soma += x;
				x = sc.nextInt();
				
			}
			double media = soma/contador;
			System.out.printf("MEDIA = %.2f%n", media);
		}
		else {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		
	}

}
