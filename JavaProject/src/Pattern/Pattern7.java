//
//  1
//  1  2
//  1  2  3
//  1  2  3  4
//  1  2  3  4  5

package Pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		int col = 5;

		for (int i = 0; i <= 5; i++)

		{

			for (int j = 1; j <= i; j++)

			{

				System.out.print("  " + j);
			}
			System.out.println();
		}

	}

}