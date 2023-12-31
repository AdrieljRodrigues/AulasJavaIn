package application;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 0.01);
		
		//UPCASTING  EXEMPLO CLASSE CHAMANDO UMA SUBCLASSE
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Anna", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Bob", 0.0, 0.01);
		
		//DownCasting  exemplo de subclasse chamando uma classe
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; instanceof verifica se a classe account pode ser usada pela busines
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);									//acc3 é uma account instanciada da classe savingsaccount
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) { //verifica se a classe account pode ser usada pela savings
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}*/
		
		Account acc1 = new Account(1001, "Ales", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "maria", 1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
