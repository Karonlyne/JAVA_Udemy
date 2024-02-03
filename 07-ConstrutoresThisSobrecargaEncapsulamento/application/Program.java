package application;

import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String userName = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			Account acc = new Account(accountNumber, userName, balance);
			System.out.println("Account data: ");
			System.out.println(acc);
			
			System.out.println("Enter a deposit value: ");
			double addValue = sc.nextDouble();
			acc.addValue(addValue);
			System.out.println("Updated account data: ");
			System.out.println(acc);
			
			System.out.println("Enter a withdraw value: ");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			System.out.println("Updated account data: ");
			System.out.println(acc);
			
		} else if (initialDeposit == 'n'){
			Account acc = new Account(accountNumber, userName);
			System.out.println("Account data: ");
			System.out.println(acc);
			
			System.out.println("Enter a deposit value: ");
			double addValue = sc.nextDouble();
			acc.addValue(addValue);
			System.out.println("Updated account data: ");
			System.out.println(acc);
			
			System.out.println("Enter a withdraw value: ");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			System.out.println("Updated account data: ");
			System.out.println(acc);
		}
		
		sc.close();
		
	}

}
