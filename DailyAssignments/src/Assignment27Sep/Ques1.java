//Find the Maximum Element and Average of Elements in an Array.
package Assignment27Sep;
import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	int sum=0, average=0;
	System.out.println("Enter the size of the array");
	
	int size=sc.nextInt();
	
	int ar[]=new int[size];
	System.out.println("Enter the elements of the array");
	
	for(int i=0; i<size;i++)
	{
		ar[i]=sc.nextInt();	
		sum=sum+ar[i];
	}
		
	System.out.println("Your array is ");
	
	for(int i=0; i<size;i++)
	{
		
		System.out.println(ar[i]);
		
	}
	
	average=sum/size;
	System.out.println("Sum of the array is ="+sum);
	System.out.println("Average of the array is ="+average);
	

	}

}
