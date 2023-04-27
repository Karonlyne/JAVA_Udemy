import java.util.Scanner;
public class Lanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, cod3, cod4, cod5, digite, quant;
		Double pre1, pre2, pre3, pre4, pre5;

		cod1 = 1;
		pre1 = 5.00;
		cod2 = 2;
		pre2 = 3.50;
		cod3 = 3;
		pre3 = 4.80;
		cod4 = 4;
		pre4 = 8.90;
		cod5 = 5;
		pre5 = 7.32;

		System.out.println("Codigo do produto comprado: ");
		digite = sc.nextInt();
		System.out.println("Quantidade comprada: ");
		quant = sc.nextInt();

		if ( digite == cod1){
			System.out.println("Quantidade comprada: R$ " + pre1 * quant);
		}
		else if ( digite == cod2){
			System.out.println("Quantidade comprada: R$ " + pre2 * quant);
		}
		else if ( digite == cod3){
			System.out.println("Quantidade comprada: R$ " + pre3 * quant);
		}
		else if ( digite == cod4){
			System.out.println("Quantidade comprada: R$ " + pre4 * quant);
		}
		else if ( digite == cod5){
			System.out.println("Quantidade comprada: R$ " + pre5 * quant);
		}

		
		
		
	}

}
