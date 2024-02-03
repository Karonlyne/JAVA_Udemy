package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Cambio {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double dolarValue = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double dolar = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", CurrencyConverter.reais(dolarValue, dolar));
		
		sc.close();
	}

}
