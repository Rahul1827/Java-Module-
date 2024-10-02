package Userinterface;

import Entity.Account;
import Validation.AccountValidation;
import Operations.AccountOperations;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account();
		AccountOperations accountOperations = new AccountOperations();
		AccountValidation accountValidation= new AccountValidation();
		

		int ch;
		String choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("*********Welcome To HDFC Bank*********");
			System.out.println("1. Accept Details");
			System.out.println("2. Display Details");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Transfer Amount");
			System.out.println("6. Check Balance");
			System.out.println("7. Update Balance");
			System.out.println("8. Exit");

			System.out.println("Please Enter your choice");

			ch = sc.nextInt();

			switch (ch) {

			case 1:
				
				System.out.println("Enter the account number");
				int accNo=sc.nextInt();
				
				System.out.println("Enter the account holder name");
				String accHolderName=sc.next();
				
				System.out.println("Enter the account balance");
				double bal=sc.nextDouble();
				
				boolean ans =accountValidation.checkAll(accNo, accHolderName, bal);
				
				if(ans==true)
				{
					System.out.println("Valid Inputs");
					account1.setAccountNo(accNo);
					account1.setAccountHolderName(accHolderName);
					account1.setBalance(bal);
				}
				else
				{
					System.out.println("Invalid Inputs");
					
				}

				System.out.println("Accepting the details");

				break;

			case 2:

				System.out.println("Displaying the details");
				System.out.println("Account Number is : " + account1.getAccountNo());
				System.err.println("Account Holder Nbame is :" + account1.getAccountHolderName());
				System.out.println("Account balance is :" + account1.getBalance());
				break;

			case 3:

				System.out.println("Withdrawing the amount");

				System.out.println("Enter the amount to withdraw :");
				double amount = sc.nextDouble();

				boolean result = accountOperations.Withdraw(account1, amount);

				if (result == true) {
					System.out.println("Withdraw Successfully");
					System.out.println("Your Balance is :" + account1.getBalance());

				}

				else {

					System.out.println("Withdraw failed !!");
				}

				break;

			case 4:

				System.out.println("Depositing the amount");
				amount = sc.nextDouble();
				boolean result1 = accountOperations.Deposit(account1, amount);

				if (result1 == true) {

					System.out.println("Amount Deposited Successfully");
					System.out.println("Your Balance is :" + account1.getBalance());

				}

				else {

					System.out.println("Deposited failed !!");
				}

				break;

			case 5:
				System.out.println("Enter the account number");
				accNo=sc.nextInt();
				
				System.out.println("Enter the account holder name");
			accHolderName=sc.next();
				
				System.out.println("Enter the account balance");
				 bal=sc.nextDouble();
				
				ans =accountValidation.checkAll(accNo, accHolderName, bal);
				
				if(ans==true)
				{
					System.out.println("Valid Inputs");
					account1.setAccountNo(accNo);
					account1.setAccountHolderName(accHolderName);
					account1.setBalance(bal);
				}
				else
				{
					System.out.println("Invalid Inputs");
					
				}


				//==================================================================================System.out.println("Depositing the amount");
				amount = sc.nextDouble();
				
				System.out.println("Account 1 old balance is :"+account1.getBalance());
				System.out.println("Account 2 old  balance is :"+account2.getBalance());
				System.out.println("*********************************************");
				System.out.println("*********************************************");
				result=accountOperations.Transfer(account1, amount, account2);
				
				if(result==true)
				{
					System.out.println("Amount Transfer Successfully");
					System.out.println("Account  1 New Balance is :"+account1.getBalance());
					System.out.println("Account 2 New Balance is :"+account2.getBalance());
				}
				else {
					
					
					System.out.println("Transfer Failed !! Please try again.....");
				}

				

				break;

			case 6:

				System.out.println(account1.getBalance());
				System.out.println("Done");

				break;

			case 7:
				
				System.out.println("Enter the new balance");
				 bal=sc.nextDouble();
				 account1.setBalance(bal);
				 System.out.println(account1);

				System.out.println("Details Updated");
				

				break;

			case 8:

				System.exit(0);
				System.out.println("*********Thanks for banking with us***********");

				break;

			}

			System.out.println("Do you want to continue ?  (Yes or No)");

			choice = sc.next();

		} while (choice.equalsIgnoreCase("Yes"));
		System.out.println("*********Thanks for banking with us***********");

	}
}