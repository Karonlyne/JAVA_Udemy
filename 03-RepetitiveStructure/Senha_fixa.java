import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a senha:");
		int x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("Senha Invalida! Tente Novamente:");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
		
		
		
		
		
	}

}
