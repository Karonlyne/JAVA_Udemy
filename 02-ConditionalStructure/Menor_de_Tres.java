import java.util.Locale;
import java.util.Scanner;
public class Menor_de_Tres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int a, b, c;
			
			System.out.println("Primeiro valor:");
			a = sc.nextInt();
			System.out.println("Segundo valor:");
			b = sc.nextInt();
			System.out.println("Terceiro valor:");
			c = sc.nextInt();
			
			if (a <= b && a <= c) {
				System.out.printf("MENOR = %d", a);
			}
			else if (b <= a && b <= c) {
				System.out.printf("MENOR = %d", b);
			}
			else if (c <= a && c <= b) {
				System.out.printf("MENOR = %d", c);
			}
			
//			int valor1, valor2, valor3;
//			
//			System.out.println("Primeiro Valor: ");
//			valor1 = sc.nextInt();
//			
//			System.out.println("Segundo Valor: ");
//			valor2 = sc.nextInt();
//			
//			System.out.println("Terceiro Valor: ");
//			valor3 = sc.nextInt();
//			
//			if (valor1 < valor2 && valor1 < valor3 ) {
//				System.out.println(valor1);	
//			} else if (valor2 < valor3) {
//				System.out.println(valor2);
//			} else {
//				System.out.println(valor3);
//			}
		
			sc.close();
	}

}
