import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores das coordenadas X e Y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		
		if ( y != 0 ) {
			while (x != 0 ) {
				
				if (x > 0 && y > 0) {
					System.out.println("QUADRANTE Q1");
				} else if (x > 0 && y < 0) {
					System.out.println("QUADRANTE Q4");
				} else if (x < 0 && y > 0) {
					System.out.println("QUADRANTE Q2");
				} else if (y != 0) {
					System.out.println("QUADRANTE Q3");
				}
				
				System.out.println("Digite os valores das coordenadas X e Y:");
				x = sc.nextInt();
				y = sc.nextInt();
			}
		} else {
			
		}
		sc.close();
		
	}

}
