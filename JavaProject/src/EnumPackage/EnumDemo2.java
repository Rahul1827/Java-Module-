package EnumPackage;

enum Month1{
	
	JAN, FEB, MAR, APR, MAY;
}

public class EnumDemo2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Month1 m= Month1.FEB;
		System.out.println(m);
		
		
		switch(m)
		{
		
		case  FEB :
		{
			System.out.println("This is the second month of the year");
			
			break;
		}
		
		case  MAR :
		{
			System.out.println("This is the third month of the year");
			
			break;
		}
		
		case  APR :
		{
			System.out.println("This is the fourth month of the year");
			
			break;
		}
		
		case  MAY :
		{
			System.out.println("This is the Fifth month of the year");
			
			break;
		}
		
		
		
		}
	}

}
