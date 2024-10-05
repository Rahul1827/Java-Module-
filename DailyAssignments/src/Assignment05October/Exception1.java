package Assignment05October;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	
	
	public static int checkSquare(int num) {
		
		return num*num;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Enter the number");
		
	int num = sc.nextInt();
		
    System.out.println(checkSquare(num));

    
			
			
			
		}catch (InputMismatchException e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}

}
