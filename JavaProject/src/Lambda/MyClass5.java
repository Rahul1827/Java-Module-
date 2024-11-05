package Lambda;

import java.util.ArrayList;

public class MyClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrList= new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		
		
		//to display  : 1st use of lambda expression
		
		arrList.forEach(n -> System.out.println(n));
		
		//2nd use of lambda expression
		//display the even numbers
		System.out.println("Displaying the even numbers");
		arrList.forEach(n ->
		{
			if(n%2==0)
				System.out.println(""+n);
			
		});
	}

}
