package module3;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		if(num>0)
		{
			
			
			System.out.println("Number is positive");
		}
		
else if(num<0) {
			
			
			System.out.println("Number is negative");
		}
		
		else {
			
			
			System.out.println("Number is Zero");
		}

	}

}
