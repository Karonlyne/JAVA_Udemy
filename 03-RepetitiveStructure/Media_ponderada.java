import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double x, y, n1, n2, n3, media;
		
		System.out.println("Quantos casos voce vai digitar? ");
		x = sc.nextDouble();
		
		for ( y=0; y<x; y++) {
			System.out.println("Digite tres numeros:");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			media = ((2*n1)+(3*n2)+(5*n3))/10;
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		sc.close();
		
			
	}

}
