package ExceptionHandling;
import java.util.Scanner;
public class SingleException {
public static double divide(int num1 , int num2)

{
	
	return num1/num2;

}public static void main(String[] args) {

	
	
	Scanner sc= new Scanner(System.in);
	
	try {
		
		System.out.println("Enter the two numbers :");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		double result=divide(num1 , num2);
		
		System.out.println(" result is :"+result);
		
	}

	catch(ArithmeticException e)
	{
		
		System.out.println("You can not divide any number ny zero (0)");
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}

	}

}
