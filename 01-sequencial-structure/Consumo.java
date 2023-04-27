import java.util.Locale;
import java.util.Scanner;
public class Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Distancia percorrida: ");
		int d = sc.nextInt();
		System.out.printf("Combustivel gasto: ");
		Double c = sc.nextDouble();
		Double m = d/c;


		System.out.printf("Consumo medio = %.3f%n", m);

		sc.close();
		
	}

}
