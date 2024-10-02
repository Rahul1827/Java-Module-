// A B C D E F
// B C D E F G
// C D E F G H
// D E F G H I
// E F G H I J
// F G H I J K



package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		int col = 5;

		char a='A';
		for (int i = 0; i <= row; i++) {

			for (int j = 0; j <= col; j++) {

				System.out.print( " " +(char)   ( a+i+j));
			}

			System.out.println();
		}

	}

}

