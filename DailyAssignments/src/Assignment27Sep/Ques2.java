//2.    Reverse a given Array and print.
package Assignment27Sep;
import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array...");
        size=sc.nextInt();
        
        int ar[]=new int[size];
        
        System.out.println("Enter the elements...");
        for(int i=0;i<size;i++)
        {
        	
        	ar[i]=sc.nextInt();
        }
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("Your Array is...");
        for(int i=0; i<size;i++)
        {
        	System.out.println("Index "+i+ ":"+ar[i]);
        	
        }
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("Reversed Array is ");
        
        for(int i=size-1;i>=0;i--)
        {
        	System.out.println("Index"+i+ ":"+ar[i]);
        	
        }
	}

}
