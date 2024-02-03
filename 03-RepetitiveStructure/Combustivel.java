import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int x = 0, alcool = 0, gasolina = 0, diesel = 0;

		while (x != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			x = sc.nextInt();
			
			if (x == 1) {
				alcool++;
			} else if (x == 2) {
				gasolina++;
			} else if (x == 3) {
				diesel++;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();
		}
	
		
	}

