
import java.util.Locale;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {



		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double nota1, nota2, notafinal;

		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextDouble();
		notafinal = (nota1 + nota2);
		System.out.printf("NOTA FINAL: %.1f%n", notafinal);

		if (notafinal < 60){
			System.out.println("REPROVADO");
		}
		sc.close();

		

		

	}

}