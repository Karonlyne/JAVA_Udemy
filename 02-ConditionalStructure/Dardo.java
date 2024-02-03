import java.util.Scanner;
public class Dardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Double x1, x2, x3;
		System.out.println("Digite as tres distancias:");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();

		if ( x1 > x2 && x1 > x3){
			System.out.printf("MAIOR DISTANCIA = %.2f", x1);
		}
		else if ( x2 > x3){
			System.out.printf("MAIOR DISTANCIA = %.2f", x2);
		}
		else {
			System.out.printf("MAIOR DISTANCIA = %.2f", x3);
		}
		
		
		
	}

}
