import java.util.Scanner;

public class Pares_consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soma;
		
		System.out.println("Digite um numero inteiro: ");
		int x = sc.nextInt();
		
		while (x != 0) {
			if (x%2 == 0) {
				soma = x + (x+2) + (x+4) + (x+6) + (x+8);
			} else
				soma = (x+1) + (x+3) + (x+5) + (x+7) + (x+9);
			
			System.out.println("SOMA = "+soma);
			
			System.out.println("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
			
		sc.close();
	}

}

/*Scanner sc = new Scanner(System.in);

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
*/