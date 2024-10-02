package module5;

public class OverloadingDemo {

	static public int add(int a , int b)
	{
		
		
		return (a+b);
	}
	
	
	static public int add(int a , int b , int c)
	{
		
		
		return (a+b+c);
	}
	
	static public double add(int a , double b)
	{
		
		
		return (a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result = add(10,20);
		
		System.out.println(result);
		
		int result1= add(20,30,50);
		System.out.println(result1);
		
		double result2 = add(50,20.12);
		System.out.println(result2);

	}

}
