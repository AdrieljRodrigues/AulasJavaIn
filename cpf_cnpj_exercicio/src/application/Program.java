package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			sum =+ taxPayer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}

/*
 		Enter the number of tax payers: 3
		Tax payer #1 data: Individual or company (i/c)? i
		Name: Alex
		Anual income: 50000.00
		Health expenditures: 2000.00
		Tax payer #2 data: Individual or company (i/c)? c
		Name: SoftTech
		Anual income: 40000.00
		Number of employees: 25
		Tax payer #3 data: Individual or company (i/c)? i
		Name: Bob
		Anual income: 120000.00
		Health expenditures: 1000.00

		TAXES PAID: 
		Alex: $ 11500.00
		SoftTech: $ 5600.00
		Bob: $ 29500.00

		TOTAL TAXES: $ 29500.00
 */
