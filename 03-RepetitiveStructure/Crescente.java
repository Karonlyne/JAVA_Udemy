import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println("DECRESCENTE");
			}
			else {
				System.out.println("CRESCENTE");
			}
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

		
		sc.close();
			
	}
		
		
}
