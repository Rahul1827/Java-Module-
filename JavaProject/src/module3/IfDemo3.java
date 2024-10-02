package module3;
import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int num1=sc.nextInt();
				
		
	System.out.println("Enter the Second number");
		
		int num2=sc.nextInt();
		
	System.out.println("Enter the Third number");
		
		int num3=sc.nextInt();

		
		if(num1>num2 && num1 >0  && num1 > num3)
		{
			
			System.out.println("First Number is greater and Positive");
			
		}
		
		else if (num2>num1 && num2 >0  && num2 > num3)
		{
			
			System.out.println("Second Number is greater and Positive");
			
		}
		else 
		{
			
			System.out.println("Third Number is greater and Positive");
			
		}
		
		
		
	}

}
