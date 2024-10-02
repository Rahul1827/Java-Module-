package module2;
import java.util.Scanner;


public class Student {

	
	private int roll_no;
	private String name;
    private double score;
	
    Scanner sc= new Scanner(System.in);	
    
    public void accept()

    {
    	System.out.println("Enter the roll Number");
    	roll_no=sc.nextInt();
    	
    	System.out.println("Enter the Name");
    	name=sc.next();
    	
    	System.out.println("Enter the Score");
    	score=sc.nextDouble();
    	
    	
    	
    }
	public  void attendClass()

	{
		
		System.out.println("attending the class");
		
	}
	
	public  void appearExam()

	{
		
		System.out.println("Appearing Exam");
		
	}
	
	public  void completeAssignment()

	{
		
		System.out.println("Completing the Assignment");
	
	}
	
	
	public void display()

	{
		System.out.println("Student Roll Number is ="+roll_no);
		System.out.println("Student Name is ="+name);
		System.out.println("Student Score is ="+score);
	}


}
