package Static;

public class StaticVarDemo {
	
	
	static int num=1;
	public void display()
	{
		
		
		num++;
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(num);
System.out.println(StaticVarDemo.num);
	
	}

}
