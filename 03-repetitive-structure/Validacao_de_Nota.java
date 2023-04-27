import java.util.Scanner;
public class Validacao_de_Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		
		
		Double x, y, c;
		System.out.println("Digite a primeira nota:");
		x = sc.nextDouble();

		while ( x < 0 || x > 10 ){
			System.out.println("Valor invalido! Tente novamente:");
			x = sc.nextDouble();
		}

		System.out.println("Digite a segunda nota:");
		y = sc.nextDouble();

		while ( y < 0 || y > 10 ){
			System.out.println("Valor invalido! Tente novamente:");
			y = sc.nextDouble();
		}

		c = (x + y)/2;
		System.out.printf("MÉDIA = %.2f", c);

		
		
		
	}

}
