//
//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. A student passes
//if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.


package Assignment1;
import java.util.Scanner;

public class Ques2 {

	private String name;
	private float sub1;
	private float sub2;
	private float sub3;
	private double total;
	private double average;
	
	
	
	Scanner sc= new Scanner(System.in);
	
	public void getStudentInfo ()
	{
		
		System.out.println("Enter the name of the student");
		name=sc.next();
		
		
		System.out.println("Enter the  Subject 1 marks");
		sub1=sc.nextFloat();
		
		System.out.println("Enter the  Subject 2 marks");
		sub2=sc.nextFloat();
		
		System.out.println("Enter the  Subject 3 marks");
		sub3=sc.nextFloat();
		
		total=sub1+sub2+sub3;
		average=total/3;
		
	}
	
	
	public void checkResult()
	{
		
		if(average>60 && sub1>40 && sub2 >40 && sub3>40)
		{
			System.out.println(name+" is Pass");
			
		}
		else {
			
			System.out.println(name+ " is fail");
		}
		
	}
	
	public void display()

	{
		
System.out.println("Name  = " + name);
		
		System.out.println("Subject 1  = " +sub1);
		
		System.out.println("Subject 2 = " + sub2);
		
		System.out.println("Subject 3 = " + sub3);
		
		System.out.println("Total Marks = " + total);
		
		System.out.println("Average Marks = " + average);
		
		
	}
	
	
}
