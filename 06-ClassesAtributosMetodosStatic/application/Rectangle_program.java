package application;
import java.util.Scanner;

import entities.Rectangle;

public class Rectangle_program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura do retângulo:");
		
		Rectangle a = new Rectangle();
		a.width = sc.nextDouble();
		a.height = sc.nextDouble();
		
		
		System.out.println(a);
		
		
	}

}
