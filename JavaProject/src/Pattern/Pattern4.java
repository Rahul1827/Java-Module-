//
//    0    1    0    1    0
//    1    0    1    0    1
//    0    1    0    1    0
//    1    0    1    0    1
//    0    1    0    1    0


package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		int col = 5;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print("   " + (i + j) % 2);
			}

			System.out.println();
		}

	}

}

