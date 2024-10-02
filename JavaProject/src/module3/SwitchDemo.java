package module3;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		
		switch(num)
		{
		
		case 5: System.out.println("Movie Time");
		break;
		
		case 6: System.out.println("Super Saturday");
		break;
		
		case 7: System.out.println("Sleepy Sunday");
		break;
		
		default:
			
			System.out.println("wake up its a working day");
		
		
		
		}
	}

}
