package Pattern;

import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
       
    	
    	System.out.println("Enter the Number");
    	Scanner sc=new Scanner(System.in);
    	
    	int num=sc.nextInt();

       
        for (int i = num / 2; i <= num; i += 2) {
            for (int j = 1; j < num - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}