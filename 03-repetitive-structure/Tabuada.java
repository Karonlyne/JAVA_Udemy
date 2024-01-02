import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int tabuada = 0;
		System.out.println("Deseja a tabuada para qual valor? ");
		int x = sc.nextInt();
		
		for ( i=1; i <= 10; i++) {
			tabuada = (x * i);
			System.out.printf("%d x %d = %d%n", x, i, tabuada);
		}
		
		
		
		
		
		
		
		
		
	}

}
