package Assignment9October;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	Name name1=new Name("Rahul", "Pramod", "Patil");
	Name name2=new Name("Swapnil", "Pramod", "Patil");
	
	Name name3=new Name("Riyanshi", "Swapnil", "Patil");
	
	
	
		Address address1= new Address("Indore ", "MadhyaPradesh","India") ;
		Address address2= new Address("Nashik ", "Maharashtra","India") ;
		Address address3= new Address("Raver ", "Maharashtra","India") ;
		
		Student std= new Student(1, name1, address1);
		Student std1= new Student(1, name2, address2);
		
		Student std2= new Student(1, name3, address3);
		
		
		
		std1.display();
		std1.display();
		std2.display();
		
		
	

	}

}
