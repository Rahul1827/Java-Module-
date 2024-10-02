package module3;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


System.out.println("Enter the two numbers");
int num1= sc.nextInt();
int num2=sc.nextInt();


if(num1>num2)
{
	

System.out.println("Number one is greater"+num1);
}

else if(num1==num2)
{
	
System.out.println("Numbers are same");
}
else {
	
	System.out.println("Number two is greater"+num2);
}



	}

}
