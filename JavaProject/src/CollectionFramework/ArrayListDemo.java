package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrList = new ArrayList();
		
		Employee emp1 = new Employee(1, "Rahul", 52000);
		Employee emp2 = new Employee(2, "Akshay", 53000);
		Employee emp3 = new Employee(3, "Pradeep", 51000);
		Employee emp4 = new Employee(4, "Shrikant", 52000);
		Employee emp5 = new Employee(5, "Ajay", 50000);
		Employee emp6 = new Employee(6, "Om", 51500);
		
		
		arrList.add(emp1);
		arrList.add(emp2);
		arrList.add(emp3);
		arrList.add(emp4);
		arrList.add(emp5);
		arrList.add(emp6);
		
		
		for(int i =0 ; i<arrList.size();i++)
		{
			
			
			System.out.println(arrList.get(i));
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		}

	
	
	
	
	
	}

}
