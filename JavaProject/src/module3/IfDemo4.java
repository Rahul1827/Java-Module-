package module3;
import java.util.Scanner;

public class IfDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int num =sc.nextInt();
		
		if(num>=0 && num<=9)
		{
			
			
			
			System.out.println("The given number is one digit number"+num);
		}
		
		else if(num>=10 && num<=99)
		{
			
			
			
			System.out.println("The given number is two digit number"+num);
		}
		
		else if(num>=100 && num<=999)
		{
			
			
			
			System.out.println("The given number is three digit number"+num);
		}
		
		else if(num>=1000 && num<=9999)
		{
			
			
			
			System.out.println("The given number is four digit number"+num);
		}
		
		else
		{
			
			
			
			System.out.println("The given number is five digit or more"+num);
		}

	}

}
