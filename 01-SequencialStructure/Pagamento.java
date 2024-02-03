import java.util.Locale;
import java.util.Scanner;
public class Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Nome: ");
		String n = sc.next();
		System.out.printf("Valor por hora: ");
		Double v = sc.nextDouble();
		System.out.printf("Horas trabalhadas: ");
		int h = sc.nextInt();
		Double t = (h * v);
	

	
		System.out.printf("O pagamento para %s deve ser %.2f%n", n, t);

		sc.close();
	}

}
