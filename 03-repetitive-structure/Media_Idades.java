import java.util.Scanner;

public class Media_Idades {
	
	// correcao: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_idades.java

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades:");
		
		int idade = sc.nextInt();
		double mediaIdade = 0.0;
		int contador = 0;
				
		while (idade > 0) {
			contador += 1;
			mediaIdade += idade;
			idade = sc.nextInt();
		}
		
		if (contador > 1) {
			System.out.printf("MEDIA = %.2f", mediaIdade / contador);
		}
		else {System.out.println("IMPOSSIVEL CALCULAR");
		}
		
		sc.close();
	}

}
