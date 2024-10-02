//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.
//
//




package Assignment1;
import java.util.Scanner;

public class Ques1 {
	
	
	private String personName;
	private int age;
	private double income;
	
	
	
	Scanner sc= new Scanner(System.in);
	
	
	public void getPersonDetails()
	{
		System.out.println("Enter the person name");
		personName=sc.next();	
		
		
		System.out.println("Enter the person age");
          age=sc.nextInt();
          
          System.out.println("Enter the person income");
  		income=sc.nextDouble();
		
	}
	
	
	
	public  void checkAge()
	{
	
		
		if(age >18 && age< 60 && income >25000)
		{
			
			System.out.println("Person is eligible for Loan");
			
		}
		
		else {
			
			System.out.println("Person is not available to loan");
			
		}
		
		
	}
	
	public void display()

	{
		
		System.out.println("Name of the person is = " + personName);
		
		System.out.println("Age of the person is = " + age);
		
		System.out.println("Income of the person is = " + income);
		
	}
}
