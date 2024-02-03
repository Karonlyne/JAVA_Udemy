package application;

import java.util.Scanner;

import entities.Student;

public class Stundent_program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student novo = new Student();
		
		System.out.print("Name: ");
		novo.name = sc.nextLine();
		System.out.print("Nota 1: ");
		novo.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		novo.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		novo.nota3 = sc.nextDouble();
		
		System.out.println(novo.passoufalhou());
		
		sc.close();
	}

}
