package Assignment08OCtober;

import java.util.ArrayList;



public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Account> arrList = new ArrayList<Account>();
		
		Account acc1 = new Account(1, "Rahul", 100000);
	Account acc2 = new Account(2, "Akshay", 50000);
	

      arrList.add(acc1);
   
     arrList.add(acc2);
     
     
     for (int i = 0; i < arrList.size(); i++) {
    	
 	 			System.out.println(arrList.get(i));
   	 		}
     
     
     System.out.println("*****************************************");
     
     ArrayList<Employee> arr1List= new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1, "Rahul", 52000);
		Employee emp2 = new Employee(2, "Akshay", 53000);
		Employee emp3 = new Employee(3, "Pradeep", 51000);
		

		
		arr1List.add(emp1);
		arr1List.add(emp2);
		arr1List.add(emp3);
		
		for (int i = 0; i < arr1List.size(); i++) {
			System.out.println(arr1List.get(i));
		}

     
		System.out.println(arr1List.contains(emp3));
//	ArrayList<Account> arrList = new ArrayList<Account>();
//
//		Account acc1 = new Account(1, "Rahul", 100000);
//		Account acc2 = new Account(2, "Akshay", 50000);
//		Account acc3 = new Account(3, "Pradeep", 50000);
//		Account acc4 = new Account(4, "Rishabh", 10000);
//		Account acc5 = new Account(5, "Rupesh", 104000);
//		Account acc6 = new Account(6, "lavesh", 14000);
//
//		arrList.add(acc1);
//
//		arrList.add(acc2);
//
//		arrList.add(acc3);
//
//		arrList.add(acc4);
//
//		arrList.add(acc5);
//
//		arrList.add(acc6);
//
//		for (int i = 0; i < arrList.size(); i++) {
//
//			System.out.println(arrList.get(i));
//		}

	}

}
