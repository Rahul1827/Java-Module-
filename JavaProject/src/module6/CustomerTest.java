package module6;
import java.util.Scanner;
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		Customer customer=new Customer();
		
		System.out.println(customer);

//		System.out.println("Customer id is ="+customer.getCustId());
//		System.out.println("Customer name is ="+customer.getName());
//		System.out.println("Customer mobile bumber is ="+customer.getMobNo());
//		System.out.println("Customer address is ="+customer.getAddress());

		System.out.println("************************************************************");
		System.out.println("This is a parameterized constructor.......");
		
		Customer customer1=new Customer(110,"Rahul", "98685687587", "Indore");
		
		System.out.println(customer1);

//		System.out.println("Customer id is ="+customer1.getCustId());
//		System.out.println("Customer name is ="+customer1.getName());
//		System.out.println("Customer mobile bumber is ="+customer1.getMobNo());
//		System.out.println("Customer address is ="+customer1.getAddress());
//		
		
	

	}

}
