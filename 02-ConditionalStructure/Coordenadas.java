import java.util.Scanner;
public class Coordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de X: ");
		Double X = sc.nextDouble();
		System.out.println("Valor de Y: ");
		Double Y = sc.nextDouble();

		if (X == 0 && Y == 0){
			System.out.println("Origem");
		}
		else if (X != 0 && Y == 0){
			System.out.println("Eixo X");
		}
		else if (X == 0 && Y != 0){
			System.out.println("Eixo Y");
		}
		else if (X > 0 && Y > 0){
			System.out.println("Q1");
		}
		else if (X > 0 && Y < 0){
			System.out.println("Q4");
		}
		else if (X < 0 && Y < 0){
			System.out.println("Q3");
		}
		else {
			System.out.println("Q2");
		}
		
		sc.close();
	}

}
