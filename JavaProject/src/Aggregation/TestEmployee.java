package Aggregation;


class Address{
	
	 String city, state , country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	 
	 
	
	
}


class Employee{
	
	int id;
	String name;
	Address address;  // has a relationship
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;  // has a relationship
	}
	
	
	
	public void display()
	{
		
		System.out.println("Name is "+name);
		System.out.println("City is "+address.city+ "and State is "+address.state+ "and Countrty is "+address.country);
	
		
		
	}	
	
}
public class TestEmployee {

	public static void main(String[] args) {


		Address address1= new Address("Indore ", "MadhyaPradesh","India") ;
		Address address2= new Address("Nashik ", "Maharashtra","India") ;
		
		Employee emp1 = new Employee(1, "rahul", address1);
		Employee emp2 = new Employee(2, "Swapnil", address2);
		
		emp1.display();
		
		System.out.println("**********************************************");
		
		emp2.display();
		
		
		
	}

}
