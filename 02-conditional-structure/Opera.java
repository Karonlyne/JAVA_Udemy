import java.util.Locale;
import java.util.Scanner;
public class Opera {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos:");
		int a = sc.nextInt();
		Double b = 50.00 + ((a - 100) * 2);
		
		if (a < 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		else {
			System.out.printf("Valor a pagar: R$ %.2f", b);
		}
		
		
//		int minutos;
//		
//		Double valorPagar = 50.0;
//		
//		System.out.println("Digite a quantidade de minutos: ");
//		minutos = sc.nextInt();
//		
//		if (minutos > 100) {
//			int taxa = (minutos - 100) * 2;
//			System.out.printf("Valor a pagar: R$ %.2f", valorPagar + taxa);
//		} else {
//			System.out.printf("Valor a pagar: R$ %.2f", valorPagar);
//		}
		
	sc.close();
	
	}

}
