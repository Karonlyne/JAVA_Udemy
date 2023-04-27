import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double l, c, v, a, p;
		l = sc.nextDouble();
		c = sc.nextDouble();
		v = sc.nextDouble();
		a = l * c;
		p = a * v;
		System.out.printf("Digite a largura do terreno: %.1f%n", l);
		System.out.printf("Digite ao comprimento do terreno: %.1f%n", c);
		System.out.printf("Digite o valor do metro quadrado do terreno: %.2f%n", v);
		System.out.printf("Area do terreno: %.2f%n", a);
		System.out.printf("Preco do terreno: %.2f%n", p);

		sc.close();


	}

}
