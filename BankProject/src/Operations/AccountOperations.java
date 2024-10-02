package Operations;

import Entity.Account;

public class AccountOperations {

	// account : 1, "Rahul", 50000
	public boolean Withdraw(Account account, double amount) // 2000

	{
		double bal = account.getBalance(); // 50000
		if (bal < amount) {

			System.out.println("You have a insufficient balance!");
			return false;

		} else if (amount < 0) {

			System.out.println("Withdraw amount should not be negative . Please enter amount greater than 0");
			return false;
		} else {
			bal = bal - amount; // 50000-2000=48000
			account.setBalance(bal);
			return true;
		}

	}

	public boolean Deposit(Account account, double amount) {
		double bal = account.getBalance();

		if (amount < 0) {

			System.out.println("amount should be Greater than 0");
			return false;

		} else if (amount > 10000) {

			System.out.println("Show the proof.");
			return false;
		} else {

			bal = bal + amount;

			account.setBalance(bal);
			System.out.println("Updated Account balance is =" + bal);
			return true;

		}

	}

	public boolean Transfer(Account account1, double amount, Account account2) {

		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();
		if (amount < 0) {

			System.out.println("Amount should be greater than 0 !");
			return false;

		}

		else if (bal1 < amount) {

			System.out.println("You dont have a sufficient balance to transfer !!");
			return false;
		}

		else {

			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account2.setBalance(bal2);

			System.out.println("Transfer Scuccessfully !");

			return true;

		}

	}

}