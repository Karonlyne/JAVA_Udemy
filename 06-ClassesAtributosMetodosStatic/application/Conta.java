package application;

import java.util.Scanner;

import entities.Bill;

public class Conta {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		System.out.println();
		System.out.println(bill.toString());
		
		sc.close();

	}

}
