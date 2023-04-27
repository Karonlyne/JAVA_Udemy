import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Deseja a tabuada para qual valor? ");
		int x = sc.nextInt();
		int i = 0;
		
		for (i=1; i <= 10; i++){
			int n = (x * i);
			System.out.println(x + " x " + i + " = " + n);
		}
		
		
		
	}

}
