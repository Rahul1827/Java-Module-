package module6;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]=new int[5];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<5;i++) {		
		ar[i]=sc.nextInt();
		}

		System.out.println("Displaying the array");
		
		for(int i=0;i<5;i++) {		
		System.out.println(ar[i]);
			}
		
		
		System.out.println("************************************");
		
		for(int temp:ar)
		{
			System.out.println(temp);
			
			
		}
		
	}

}
