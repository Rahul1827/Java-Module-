package module4;
import java.util.Scanner;

public class Employee {
	
	
	private int empNo;
	private String name;
	private double balance;
	
	Scanner sc= new Scanner (System.in);
	
	public void getDetails()
	{
		
		System.out.println("Enter the Employee Number ");
		empNo=sc.nextInt();
		
		System.out.println("Enter the Employee Name ");
		name=sc.next();
		
		System.out.println("Enter the balance ");
		balance=sc.nextDouble();
	
		
	}
	
	public void checkEmpNo()
	{
		if(empNo>0)
		{
			
			System.out.println("Employee Number is valid");
			
		}
		
		else {
			
			System.out.println("Employee Number is invalid");
			
			
		}
	}
	
		public void checkBalance()

		{
			if(balance >0 && balance<100000)
			{
				System.out.println("Valid Balance");
				
			}
			
			else {
				System.out.println("Invalid balance");
				
			}
			
	
		
		}
		
		public void display()

		{
			System.out.println("Employee number  is ="+empNo);
			System.out.println("Employee name="+name);
			System.out.println("Balance is ="+balance);
			
			
		}
		
		
		
	}
	


