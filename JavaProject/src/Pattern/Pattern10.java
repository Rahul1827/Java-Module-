package Pattern;
import java.util.Scanner;


public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the row and column");
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int col=sc.nextInt();

//		for (int i = 0; i <row; i++)
//
//		{
//
//			for (int j = 0; j < col; j++)
//
//			{
//if(i==2 || j==2)
//{
//	System.out.print("*");
//
//}
//
//else {
//				
//				System.out.print("0");
//			}
//			}
//			System.out.println();
//		}

		
		for (int i = 0; i <row; i++)

		{

			for (int j = 0; j < col; j++)

			{
if(i==j)
{
	System.out.print("*");

}

else {
				
				System.out.print("-");
			}
			}
			System.out.println();
		}

		
	}

}
