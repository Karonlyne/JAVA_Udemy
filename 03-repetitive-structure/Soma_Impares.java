import java.util.Scanner;

public class Soma_Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, somaImpares;
		System.out.println("Digite dois numeros: ");
		
		y = sc.nextInt();
		x = sc.nextInt();
		somaImpares = 0;
		
		for (int i = x-1; i > y; i--) {
			if (i % 2 == 1 || i % 2 == -1) {
				somaImpares+= i;
			}
		}
		
		for (int i = x+1; i < y; i++) {
			if (i % 2 == 1 || i % 2 == -1) {
				somaImpares+= i;
			}
		}
			
		System.out.println(somaImpares);	
		
		sc.close();
	}

}
