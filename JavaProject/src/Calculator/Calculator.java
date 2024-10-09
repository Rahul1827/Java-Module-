package Calculator;

import java.lang.foreign.AddressLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator extends Exception {

	private int num1, num2;

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public static int add(int num1, int num2) {
		if (num1 <= 0 || num2 <= 0) {

			throw new ArithmeticException(
					"negative number is not accepted . Please Enter number greater then zero (0)");

		}

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		if (num1 <= 0 || num2 <= 0) {

			throw new ArithmeticException(
					"negative number is not accepted . Please Enter number greater then zero (0)");

		}

		return num1 - num2;
	}

	public static double Mul(double num1, double num2) {
		if (num1 <= 0 || num2 <= 0) {

			throw new ArithmeticException(
					"negative number is not accepted . Please Enter number greater then zero (0)");

		}
		return num1 * num2;
	}

	public static double div(double num1, double num2) {

		if (num1 <= 0 || num2 <= 0) {

			throw new ArithmeticException(
					"negative number is not accepted . Please Enter number greater then zero (0)");

		}

		return num1 / num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int ch;
		String choice;
		try {
			do {

				System.out.println("Hii I am  A calculator");
				System.out.println("1. Addition");
				System.out.println("2. Substraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Divison");

				System.out.println("Enter the choice");
				ch = sc.nextInt();

				System.out.println("Enter the 2 numbers");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();

				switch (ch) {

				case 1: {

					int resultAdd = add(num1, num2);
					System.out.println(resultAdd);
					System.out.println("=======================================");
					break;

				}

				case 2: {

					int resultSub = sub(num1, num2);
					System.out.println(resultSub);

					System.out.println("=======================================");
					break;

				}
				case 3: {

					double resultMul = Mul(num1, num2);
					System.out.println(resultMul);

					System.out.println("=======================================");

					break;
				}

				case 4: {

					double resultDiv = div(num1, num2);
					System.out.println(resultDiv);

					System.out.println("=======================================");

				}

				}

				System.out.println("Do you want to continue ?  (Yes or No)");

				choice = sc.next();

			}

			while (choice.equalsIgnoreCase("Yes"));
			System.out.println("*********Thanks for Using the Calculator***********");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
