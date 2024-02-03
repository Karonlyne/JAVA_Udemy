import java.util.Scanner;

public class Sequencia_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		int y = 1;
				
		if (x>y) {
			for (int i = y ; i <= x; i++)
				if (i % 2 == 1 || i % 2 == -1) {
					System.out.println(i);
				}
		}
		else {
			for (int i = y ; i >= x; i--)
				if (i % 2 == 1 || i % 2 == -1) {
					System.out.println(i);
				}
		}
		


		
		sc.close();
	}

}