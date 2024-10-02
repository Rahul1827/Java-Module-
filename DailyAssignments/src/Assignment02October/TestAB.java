//
//4.    Suppose a class 'A' has a static method to print "Parent". Its subclass 'B'
//also has a static method with the same name to print "Child". Now call this method by the
//objects of the two classes. Also,call this method by an object of the parent class 
//referring to the child class i.e. A obj=new B()

package Assignment02October;

class A {

	static void print()

	{
		System.out.println("Parent");
	}

}

class B extends A {

	static void print() {

		System.out.println("Child");
	}

}

public class TestAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A.print();
		B.print();

		System.out.println("*****************************************");

		A a = new B();
		a.print();
	}

}
