package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test{
	
	private String s;
	public Test()
	{
		s="Hello World";
		
	}
	
	public void method1() {
		System.out.println("The String is "+s);
	}
	
	public void method2(int n) {
		System.out.println("The number is "+n);
	}
	
	public void method3() {
		System.out.println("Private method invoked" );
	}
	
}


public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test obj= new Test();
		Class cls =obj.getClass();
		System.out.println("The name of class is "+cls.getName());
		
		//Getting the constructor of the class through the Constructor
		
         Constructor constructor =cls.getConstructor();
         System.out.println("The name of constructor is "+constructor.getName());
         
         System.out.println("The public methods of class are:");
         Method[] methods=cls.getMethods();
         for(Method a: methods)
        	 System.out.println(a.getName());
         
         System.out.println("===========================================");
         Method methodcall1 = cls.getDeclaredMethod("method2",int.class);
         
         methodcall1.invoke(obj, 22);
         
        Field field = cls.getDeclaredField("s");
         field.setAccessible(true);
         field.set(obj, "JAVA");
         
         
         Method methodcall2 = cls.getDeclaredMethod("method1");
         
         methodcall2.invoke(obj);
         
         Method methodcall3 = cls.getDeclaredMethod("method3");
         field.setAccessible(true);
         methodcall3.invoke(obj);
         
         

	}

}
