import java.util.Locale;
import java.util.Scanner;
public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double r, pi, area;
		System.out.printf("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(r,2);

		System.out.printf("AREA = %.3f%n", area);
		
		sc.close();
		
	}

}
