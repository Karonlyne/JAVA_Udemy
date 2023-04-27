import java.util.Scanner;
public class Senha_Fixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int y, x;
		y = 2002;
		System.out.println("Digite a Senha: ");
		x = sc.nextInt();

		while (y != x){
		System.out.println("Senha Invalida! Tente Novamente");
		x = sc.nextInt();

		}
		System.out.println("Acesso Permitido");
		
		
	}

}
