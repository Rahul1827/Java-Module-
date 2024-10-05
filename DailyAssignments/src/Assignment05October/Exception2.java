package Assignment05October;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the position (0 to " + (n - 1) + ") of the element to retrieve: ");
		int position = scanner.nextInt();

		try {
			System.out.println("Element at position " + position + ": " + array[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Position " + position + " is out of bounds.");
		}

		
	}
}

