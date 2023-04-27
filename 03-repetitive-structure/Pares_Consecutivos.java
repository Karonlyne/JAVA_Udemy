import java.util.Scanner;

public class Pares_Consecutivos {

	public static void main(String[] args) {
		
		// correcao: https://github.com/acenelio/curso-algoritmos/blob/master/java/pares_consecutivos.java
		
		Scanner sc = new Scanner(System.in);
		
		int x, i, valorSoma;
		
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		while (x != 0) {
			i = 0;
			valorSoma = 0;
			if (x % 2 == 0) {
				
				while ( i < 5) {
					valorSoma += x;
					i++;
					x += 2; 
				}
			} else {
				x += 1;
				while ( i < 5) {
					valorSoma += x;
					i++;
					x += 2; 
				}
			}
			
			System.out.println("SOMA = " + valorSoma);
			
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
			
		}
		
		sc.close();
	}

}
