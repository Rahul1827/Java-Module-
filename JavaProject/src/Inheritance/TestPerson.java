package Inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Person person=new Person("Rahul",24, 'M');
//		System.out.println(person);
//		person.display();
//		person.fun1();
		Person arr[]= new Person[5];
		 arr[0]=new Person("Rahul",23,'M');
		 arr[1]=new Person("Akshay",23,'M');
		 arr[2]=new Person("Pradeep",23,'M');
		 arr[3]=new Person("Divya",24,'F');
		 arr[4]=new Person("Riya",22,'F');

		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i].getName()+ "is " +arr[i].getAge()+" year old  and Gender is "+arr[i].getGender());
			
		}
		
		System.out.println("*******************************************");
		
		
		Student student = new Student("Rahul", 23, 'M', 101, "CS", 90);
		System.out.println(student);
		student.display();
		
		
		System.out.println("*******************************************");
		
		Employee employee = new  Employee("Rahul", 23, 'M',1011, "CS", 98, 121, "Amdocs", 500000);
		System.out.println(employee);
		//employee.display();

		System.out.println("*******************************************");
		


		System.out.println("*******************************************");
		

		
		Person person2= new Person("unknown", 21, 'M');
		  System.out.println(person2);
		
		
		person2=new Student("ABC", 20, 'M', 111,"CDAC", 87);
		
		 System.out.println(person2);
		
		person2 = new Employee("PataNahi", 25, 'F', 1010, "CDAC", 98, 420, "XYZ", 200);
		
		 System.out.println(person2);
	}

}
