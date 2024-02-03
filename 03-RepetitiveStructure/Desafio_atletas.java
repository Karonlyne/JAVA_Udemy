import java.util.Scanner;

public class Desafio_atletas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double altura, peso, altura_alta=0, peso_medio=0, altura_mulher=0, altura_media=0, sexo_homem=0, sexo_mulher=0, porcentagem_homem=0;
		String nome, sexo, atleta_alto = "A";
		
		System.out.println("Qual a quantidade de atletas? ");
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Digite os dados do atleta numero: "+i);
			System.out.print("Nome: ");
			nome = sc.next()+ " " + sc.next();
			System.out.print("Sexo: ");
			sexo = sc.next();
			while ( !sexo.equals("F") && !sexo.equals("M") ) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next();
			}
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura<=0) {
				System.out.println("Valor invalido! Favor digitar um valor positivo: ");
				System.out.print("Altura: ");
				altura = sc.nextDouble();
			}
			if (altura_alta < altura) {
				altura_alta = altura;
				atleta_alto = nome;
			}
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso<=0) {
				System.out.println("Valor invalido! Favor digitar um valor positivo: ");
				System.out.print("Peso: ");
				peso = sc.nextDouble();
			}
			peso_medio += peso;
			if (sexo.equals("M")) {
				sexo_homem++;
			}
			porcentagem_homem = (sexo_homem/x)*100;
			if (sexo.equals("F")) {
				sexo_mulher++;
				altura_mulher += altura;
			}
		}
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n",(peso_medio/x));
		System.out.println("Atleta mais alto: "+atleta_alto);
		System.out.printf("Porcentagem de homens: %.2f%%%n",porcentagem_homem);
		if (sexo_mulher>0) {
			altura_media = altura_mulher/sexo_mulher;
			System.out.printf("Altura média das mulheres: %.2f%n",altura_media);	
		}
		else { 
			System.out.println("Não há mulheres cadastradas");	
		}
		sc.close();
	}
}
