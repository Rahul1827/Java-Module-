package module2;
import java.util.Scanner;

import java.util.Scanner;

public class Employee {
	
	
	private int empNo;
	private String name;
	private double empSalary;
	
	
	 Scanner sc= new Scanner(System.in);	
	    
	    public void accept()

	    {
	    	System.out.println("Enter the Employee Number");
            empNo=sc.nextInt();
	    	
	    	System.out.println("Enter the Name of the Employee");
	    	name=sc.next();
	    	
	    	System.out.println("Enter the Salalry of Employee");
	    	empSalary=sc.nextDouble();
	    	
	    	
	    	
	    }
		public  void completeProject()

		{
			
			System.out.println("Project is completed");
			
		}
		
		public  void checkAttendance()

		{
			
			System.out.println("Checking the attendance");
			
		}
		
		public  void applyLoan()

		{
			
			System.out.println("Applying for loan");
		
		}
		
		
		public void display()

		{
			System.out.println("Employee Number is  ="+empNo);
			System.out.println("Employee Name is ="+name);
			System.out.println("Employee Salary is ="+empSalary
					);
		}

	

}
