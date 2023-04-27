import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		char escala = sc.next().charAt(0);

		if (escala == 'C'){
			System.out.println("Digite a temperatura em Celsius: ");
			double cel = sc.nextDouble();
			double fahcel = (9 * cel)/5 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahcel);
		}
		else if (escala == 'F'){
			System.out.println("Digite a temperatura em Fahrenheit: ");
			double fah = sc.nextDouble();
			double celfah = 5 *(fah - 32)/9;
			System.out.printf("Temperatura equivalente em Celsius: %.2f", celfah);
		}
		
		sc.close();
	}

}
