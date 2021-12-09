package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<TaxPayers> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = input.nextInt();
		
		//input.next();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = input.next().charAt(0);
			
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Anual income: ");
			double incomeValue = input.nextDouble();
			
			if(ch == 'i') {				
				System.out.print("Health expenditures: ");
				double healthExpenditureValue = input.nextDouble();
				//TaxPayers payer = new Individual(name, incomeValue, healthExpenditureValue);
				Individual payer = new Individual(name, incomeValue, healthExpenditureValue);
				list.add(payer);
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = input.nextInt();
				//TaxPayers payer = new Company(name, incomeValue, numberEmployees);
				Company payer = new Company(name, incomeValue, numberEmployees);
				list.add(payer);
			}
		}		
		
		System.out.println();
		System.out.println("TAXES PAID");		
		
		double totalTaxes = 0;
		
		for(TaxPayers p : list) {			
			System.out.println(p.toString());
			totalTaxes += p.tax();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		input.close();

	}

}
