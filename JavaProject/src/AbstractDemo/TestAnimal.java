package AbstractDemo;



abstract class Animal{
	
	
	
	final int leg=4;
	abstract public void sound();
	abstract public void fun2();
	abstract public void fun1();
	
	
	public  void classInfo(String type)
	{
		
		System.out.println("he  belongs to "+ type+ "has "+leg+ "legs");
		
	}
	
}


class Dog extends Animal
{
	

public void sound()
{
	System.out.println("The dog Barks.........");
}

public void fun1()
{
	

System.out.println("This is fun1");
}


public void fun2()
{
	

System.out.println("This is fun2");
}

}

//


class Lion extends Animal
{
	

public void sound()
{
	System.out.println("The Lion come.........");
}

public void fun1()
{
	

System.out.println("This is fun1");
}


public void fun2()
{
	

System.out.println("This is fun2");
}

}


//
public class TestAnimal {

	public static void main(String[] args) {
		
		
		Dog tuffy=new Dog();
		tuffy.classInfo("Dog");
		tuffy.sound();
		tuffy.fun1();
		tuffy.fun2();

		
		
		System.out.println("*******************************************************");
		
		
		Lion sheru=new Lion();
		sheru.classInfo("Lion");
		sheru.sound();
		sheru.fun1();
		sheru.fun2();
	}

}
