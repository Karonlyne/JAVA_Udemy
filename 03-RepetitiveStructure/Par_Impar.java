import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x, y, z;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		x = sc.nextInt();
		
		for (z=0; z<x; z++) {
			System.out.println("Digite um numero: ");
			y = sc.nextInt();
			if (y==0){
				System.out.println("NULO");
			}
			else if (y % 2 == 0) {
				if (y>0) {
					System.out.println("PAR POSITIVO");
				} else {
					System.out.println("PAR NEGATIVO");
				}
			} else {	
				if (y>0) {
					System.out.println("IMPAR POSITIVO");
				} else {
					System.out.println("IMPAR NEGATIVO");
				}
			}
		}
		
		sc.close();
		
	}

}

//if (numero == 0) {
//	System.out.println("NULO");
//} else if (numero < 0 && numero % 2 == 1) {
//	System.out.println("IMPAR NEGATIVO");
//} else if (numero < 0 && numero % 2 == 0) {
//	System.out.println("PAR NEGATIVO");
//} else if (numero > 0 && numero % 2 == 1) {
//	System.out.println("IMPAR POSITIVO");
//} else {
//	System.out.println("IMPAR NEGATIVO");
//}
