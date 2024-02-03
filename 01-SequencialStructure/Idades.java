import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa:");
		System.out.println("Nome: ");
		String nome = sc.next();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.println("Nome: ");
		String nome2 = sc.next();
		
		System.out.println("Idade: ");
		int idade2 = sc.nextInt();
		
		Double media = (double) (idade + idade2)/2;

		System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome, nome2, media);


		sc.close();
		
		
	}

}
