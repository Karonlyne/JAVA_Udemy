package application;

import java.util.Scanner;

import entities.Calculator;

public class Program3 {
	
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
}
