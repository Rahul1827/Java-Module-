package module5;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=100;
		int b=100;
		
		if(a==b)
		{
			
			System.out.println("same");
			
		}
		
		String str1="Rahul";
		String str2="RAHUL";
		
		if(str1==str2)
		{
			System.out.println("same");
			
		}
		
		else 
			
		{
			System.out.println(" not same");
		}
		System.out.println("****************************************************");
		
		String str3 = new String("Rahul");
		String str4 = new String("Rahul");
		
		
		if(str3.equals(str4))
		{
			
			System.out.println("same");
		}
		else 
		{
			System.out.println("not same");
		}
		
		
		System.out.println("****************************************************");
		
		
		if(str3.equalsIgnoreCase(str4))
		{
			
			System.out.println("same");
		}
		else 
		{
			System.out.println("not same");
		}
		
	}

}
