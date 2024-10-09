package Multithreading;
class Multithread implements Runnable{

	public void fun1()

	{
		System.out.println("This is fun1");
	}
	
	
	public void fun2()

	{
		System.out.println("This is fun2");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		fun1();
		fun2();
		
		
		System.out.println(" Id is "+ Thread.currentThread().getId());
		System.out.println("Name is "+Thread.currentThread().getName());
		
	}


	}
public class MultithreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Multithread multithread = new Multithread();
		Thread thread1=new Thread(multithread);
		thread1.start();
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

		
		Multithread multithread2 = new Multithread();
		Thread thread2=new Thread(multithread);
		thread2.start();
		
//		System.out.println(" Id is "+ thread2.getId());
//		System.out.println("Name is "+thread2.getName());


	}

}
