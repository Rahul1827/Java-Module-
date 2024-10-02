package module5;

public class OverloadMain {
	
	
	public static int main(int a)

	{
		
		
		return  a;
	}
	
	public static  int main(int a, int b)

	{
		return a+b;
		
//		System.out.println("main method with 2 parameter");
	}
	
	public static double main(double a, int b, double c) 

	{
		return a+b+c;
		
//		System.out.println("main method with 3 parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int result =main(10);
		System.out.println(result);
		int result1 =main(10,20);

		System.out.println(result1);
		
		double result2 =main(10.00,20,20.20);

		System.out.println(result2);
//		OverloadMain obj =new OverloadMain();
//		obj.main();
//		obj.main(10, 020);
//		obj.main(10,10 , 10);
//		
	}

}
