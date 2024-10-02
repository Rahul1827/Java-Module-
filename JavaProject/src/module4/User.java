package module4;
import java.util.Scanner;

public class User {
	
	
	private String name;
	private int age;
	private double salary;
	
	Scanner sc= new Scanner (System.in);
	
	public void getDetails()
	{
		
		System.out.println("Enter the name ");
		name=sc.next();
		
		System.out.println("Enter the age ");
		age=sc.nextInt();
		
		System.out.println("Enter the salarry ");
		salary=sc.nextDouble();
	
		
	}
	
	public void checkAge()
	{
		if(age>18  && age<100)
		{
			
			System.out.println("You are eligible to vote");
			
		}
		
		else {
			
			System.out.println("You are not eligible to vote");
			
			
		}
	}
	
		public void checkSalary()

		{
			if(salary >0 && salary<100000)
			{
				System.out.println("Your Salary is valid");
				
			}
			
			else {
				System.out.println("Your Salary is not valid");
				
			}
			
	
		
		}
		
		public void display()

		{
			System.out.println("name is ="+name);
			System.out.println("Age is ="+age);
			System.out.println("Salary is ="+salary);
			
			
		}
		
		
		
	}
	


