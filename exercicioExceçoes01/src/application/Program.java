package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawlimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawlimit);
				
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("New balance: %.2f%n", account.getBalance());
				}
			catch(DomainException e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}
			catch(RuntimeException e) {
				System.out.println("Unexpected error"); // qualquer outra exceção 
			}		
			
			sc.close();
		}
	
	}
