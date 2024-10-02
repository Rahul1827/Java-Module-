//
//  1
//  2  2
//  3  3  3
//  4  4  4  4
//  5  5  5  5  5

package Pattern;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		int col = 5;

		for (int i = 0; i <= 5; i++)

		{

			for (int j = 1; j <= i; j++)

			{

				System.out.print("  " + i);
			}
			System.out.println();
		}

	}

}
