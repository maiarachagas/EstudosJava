package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double value;
				
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nameAccountHolder = sc.nextLine();

		BankAccount bankAccount = new BankAccount(nameAccountHolder, accountNumber);
		
		System.out.print("Do you want to change the name (y/n)?");
		char alt = sc.next().charAt(0);
		if(alt != 'n') {
			System.out.print("Enter the new name: ");
			sc.nextLine();
			bankAccount.setNameAccountHolder(sc.nextLine());
			System.out.println("Change made to: " + bankAccount.getNameAccountHolder());			
		}
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if (resp != 'n' ) {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			bankAccount.depositedValue(value);			
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bankAccount);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		bankAccount.depositedValue(value);
		System.out.println("Update account data: " + bankAccount.getBalance());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		if(value >= bankAccount.getBalance()) {
		System.out.println("Não pode haver saque.");
		}
		else {
			bankAccount.withdrawValue(value);
			System.out.printf("Será descontado uma taxa de R$ %.2f ref. ao saque efetuado.", BankAccount.TAXA);
		}
		System.out.println();
		System.out.println("Update account data: " + bankAccount.getBalance());

		sc.close();
	}

}
