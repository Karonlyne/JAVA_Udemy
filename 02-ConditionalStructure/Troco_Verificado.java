import java.util.Scanner;
public class Troco_Verificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		Double precoun, dinheiro, precotot, troco;

		System.out.println("Preço unitário do produto:");
		precoun = sc.nextDouble();
		System.out.println("Quantidade comprada:");
		int quant = sc.nextInt();
		System.out.println("Dinheiro recebido:");
		dinheiro = sc.nextDouble();
		precotot = precoun * quant;
		troco = dinheiro - precotot;

		if (dinheiro >= precotot){
			System.out.println("TROCO = " + troco);
		}
		else {
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + Math.abs(troco) + " REAIS");
		}
		
		
	}

}
