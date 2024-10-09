package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrList = new ArrayList();
		arrList.add(10);
		arrList.add(20.22);
		arrList.add("Rahul");	
		arrList.add("Rahul");
		arrList.add("Rahul");
		arrList.add("Rahul");
		arrList.add(true);

		Employee emp1 = new Employee(1, "Rahul", 52000);
		Employee emp2 = new Employee(2, "Akshay", 53000);
		arrList.add(emp1);
		arrList.add(emp2);

		// To display using for loop
		for (int i = 0; i < arrList.size(); i++) {

			System.out.println(arrList.get(i));
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		}

	
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		// To display using Iterator
		System.out.println("Using the iterator method");
		Iterator itr = arrList.iterator();
		// Iterator<Employee> itr = arrList.iterator(); // 2nd type
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		
		System.out.println("******************************************************");
		
		System.out.println("******************************************************");
		
		System.out.println("******************************************************");
		
		System.out.println("******************************************************");
		
		
		boolean result = arrList.contains("Rahul");
		System.out.println(result);
		
		
		int result1= arrList.indexOf("Rahul");
		System.out.println("Index of "+result1);
		
		result1=arrList.lastIndexOf("Rahul");
		System.out.println("Last Index of "+result1);
		
		
		
		System.out.println("=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==--=-=-==");
		
		System.out.println("Using remove");
		
		arrList.remove("Rahul");
		arrList.remove(0);
		
		for (int i = 0; i < arrList.size(); i++) {

			System.out.println(arrList.get(i));
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			
			arrList.clear();
			
			
			System.out.println(arrList.isEmpty());
			
			arrList.addFirst(250);
			arrList.addLast(780);
			
			arrList.set(0, 254);
			
			
			System.out.println("[][][][][][][][][][][][][][][][][][][][]");
			
			for ( i=0; i < arrList.size(); i++) {

				System.out.println(arrList.get(i));
		}

		}
	}

}
