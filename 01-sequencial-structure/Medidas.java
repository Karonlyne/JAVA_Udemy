import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double A, B, C, aq, atr, at;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		aq = Math.pow(A,2);
		atr = (A * B)/2;
		at = ((A + B) * C)/2;
		System.out.printf("Digite a medida A: %.1f%n", A);
		System.out.printf("Digite a medida B: %.1f%n", B);
		System.out.printf("Digite a medida C: %.1f%n", C);
		System.out.printf("AREA DO QUADRADO: %.4f%n", aq);
		System.out.printf("AREA DO TRIANGULO: %.4f%n", atr);
		System.out.printf("AREA DO TRAPEZIO: %.4f%n", at);

		sc.close();
	}

}
