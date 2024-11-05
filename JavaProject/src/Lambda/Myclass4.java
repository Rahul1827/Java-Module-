package Lambda;

import java.util.Scanner;

interface Interface5 {
    void absfuna(int x);
}

public class Myclass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt(); 

        
        Interface5 fobj = (int x) -> {
            if (x % 2 == 0) {
                System.out.println("Even: " + x);
            } else {
                System.out.println("Odd: " + x);
            }
        };

        
        fobj.absfuna(input);

        
    }
}
