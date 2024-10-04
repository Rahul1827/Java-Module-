package StaticNested;


class OuterClass
{
private static String msg="Welcome to the Nested Classes";

public static class NestedStaticClass {
	
	
	
	public void printMessage()
	{
		
		System.out.println("Message from nested static class:"+msg);
	}	
}

public class InnerClass{
	
	public void display()

	{
		System.out.println("Message from non-static nested class:"+msg);
	}
	
}
}


public class ClassesNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass .NestedStaticClass printer=new OuterClass.NestedStaticClass();
		printer.printMessage();

		
		
		
		System.out.println("******************************************************");
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner= outer.new InnerClass();
		inner.display();
	}

}
