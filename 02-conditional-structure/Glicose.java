import java.util.Scanner;
public class Glicose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a medida da glicose:");
		Double x = sc.nextDouble();

		if (x <= 100){
			System.out.println("Classificacao: normal");
		}
		else if (100 < x && x <= 140){
			System.out.println("Classificacao: elevado");
		}
		else {
			System.out.println("Classificacao: diabetes");
		}
		
		sc.close();
	}

}
