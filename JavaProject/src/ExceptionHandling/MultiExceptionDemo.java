package ExceptionHandling;
import java.util.Scanner;
public class MultiExceptionDemo {

	
	public static double divide(int num1 , int num2)

	{
		
		return num1/num2;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two values");
		String str= sc.next();
		String str1= sc.next();      
		
		
		
		try {
			
			
			
			
			
			
			int num1= Integer.parseInt(str);
			int num2= Integer.parseInt(str1);
			
			
			
			double result= divide(num1, num2);
			System.out.println("Result is "+result);
			
			
			
			
		} 
		
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Your input should be a number not a string");
	  //
	 
		}
//		catch (Exception ) {
//			// TODO: handle exception
//			
//			System.out.println("Error : There is an error");
//		}
		
		finally {
			
			
			
			System.out.println("This is a finally block");
		}

}}