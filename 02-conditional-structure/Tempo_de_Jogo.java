import java.util.Scanner;
public class Tempo_de_Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora incial: ");
		int inicial = sc.nextInt();
		System.out.println("Hora final: ");
		int ffinal = sc.nextInt();

		if (ffinal > inicial){
			int duracao = ffinal - inicial;
			System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
		}
		else if (inicial > ffinal){
			int total = (24 - inicial) + ffinal;
			System.out.println("O JOGO DUROU " + total + "HORA(S)");
		}
		else if (inicial == ffinal){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

		sc.close();
		
	}

}
