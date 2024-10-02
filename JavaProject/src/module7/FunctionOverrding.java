package module7;

class Shape {
	void calArea(String shape, int a, int b) {
		System.out.println("calArea of shape class");

	}

	void display()

	{

		System.out.println("display of shape class");
	}

	void fun1()

	{

		System.out.println("FUN1 of shape class");
	}
}

class Rectangle extends Shape {

	void calArea(String shape, int a, int b) {
		System.out.println("Area is " + (a * b));

	}

	void display()

	{
		super.display();
		super.fun1();

	}

}

public class FunctionOverrding {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.calArea("Shape", 20, 10);
		shape.display();

		System.out.println("***************************************************************************");

		Rectangle rect = new Rectangle();
		rect.calArea("Rectangle", 20, 30);
		rect.display();
	
		System.out.println("*************************************************************************");

		shape = new Rectangle();
		shape.calArea("rect", 10, 20);
		shape.display();
	}

}
