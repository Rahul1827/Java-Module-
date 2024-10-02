package module1;

public class Student {
	private int roll_no;
	private String name;
	private double score;

	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student= new Student();
		student.attendClass();
		student.appearExam();
		student.completeAssignment();
		student.roll_no=101;
		student.name="Rahul";
		student.score=98.95;
		student.display();
		
		System.out.println("******************************************************************");
		
		Student student2= new Student();
		student2.attendClass();
		student2.appearExam();
		student2.completeAssignment();
		student2.roll_no=102;
		student2.name="Shrikant";
		student2.score=99.25;
		student2.display();
		
		
	}

}
