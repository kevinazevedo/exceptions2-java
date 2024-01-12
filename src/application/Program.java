package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.MyException;

public class Program {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = scan.nextInt();
		System.out.print("Holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Initial balance: ");
		Double balance = scan.nextDouble();	
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = scan.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.print("\nEnter amount for withdraw: ");
		Double amount = scan.nextDouble();	
			
		try {	
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
			
		scan.close();
	}	
} 
