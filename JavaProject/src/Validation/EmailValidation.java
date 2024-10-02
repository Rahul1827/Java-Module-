package Validation;
import java.awt.Checkbox;
import java.util.Scanner;
public class EmailValidation {
	
	
	public void checkEmail(String email)
	{
		
		int a= email.indexOf("@");
		int d=email.indexOf(".");
		
		if(a>-1 && d>-1 && a<d)
		{
			
			
			System.out.println("Valid Email id");
		}
		else {
			
			System.out.println("Invalid Email id ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the email");
		
		String email=sc.next();
		
	EmailValidation  emailValidation= new EmailValidation();
	emailValidation.checkEmail(email);
		
		

	}

}
