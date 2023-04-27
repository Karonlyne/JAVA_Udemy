import java.util.Locale;
import java.util.Scanner;
public class Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double p, d, t;
		System.out.printf("Preço unitário do produto: ");
		p = sc.nextDouble();
		System.out.printf("Quantidade comprada: ");
		int q = sc.nextInt();
		System.out.printf("Dinheiro recebido: ");
		d = sc.nextDouble();
		t = d - (p * q);



		System.out.printf("TROCO = %.2f", t);

		sc.close();
		
	}

}
