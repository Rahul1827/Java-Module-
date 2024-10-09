package Multithreading;
class Demo {
	
	public void fun1()

	{
		System.out.println("This is fun1");
	}
	
	
	public void fun2()

	{
		System.out.println("This is fun2");
	}
	
	
}
public class MultithreadDemo extends Thread {
	
	Demo demo1 = new Demo();
	Demo demo2 = new Demo();
	
	public void run()
	{
		demo1.fun1();
		demo2.fun2();
		
		long id=Thread.currentThread().getId();
		String name=Thread.currentThread().getName();
		System.out.println("Id is"+id);
		System.out.println("name is "+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
		MultithreadDemo thread1=new MultithreadDemo();
		thread1.start();
		System.out.println("********************************");
		}
//		MultithreadDemo thread2=new MultithreadDemo();
//		thread2.start();
//		System.out.println("********************************");
//		
//		
//		MultithreadDemo thread3=new MultithreadDemo();
//		thread3.start();
//		System.out.println("********************************");
		
		
	}

}
