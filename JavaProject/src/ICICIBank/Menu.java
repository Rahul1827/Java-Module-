package ICICIBank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch;
		String choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("*********Welcome to Akshay 420 Bank*********");
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

				System.out.println("Accepting the details");

				break;

			case 2:

				System.out.println("Displaying the details");

				break;

			case 3:

				System.out.println("Withdrawing the amount");

				break;

			case 4:

				System.out.println("Depositing the amount");

				break;

			case 5:

				System.out.println("Transfering the amount");

				break;

			case 6:

				System.out.println("Checking the balance");

				break;

			case 7:

				System.out.println("Updating the details");

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
