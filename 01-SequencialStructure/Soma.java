import java.util.Locale;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, soma;
		System.out.printf("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.printf("Digite o valor de Y: ");
		y = sc.nextInt();
		soma = x + y;


		System.out.printf("SOMA = %d", soma);

		sc.close();
		
	}

}
