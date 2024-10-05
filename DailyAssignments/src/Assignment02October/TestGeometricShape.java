//2.    Create an abstract class GeometricShape with abstract methods
//like area() and perimeter(). Then, create concrete subclasses like Circle,
//Rectangle, and Triangle that inherit from GeometricShape and implement the required methods.

package Assignment02October;

abstract class GeometricShape {

	abstract public void Area();

	abstract public void perimeter();

	final static double PI = 3.14;

}

class Circle extends GeometricShape {

	private double Radius;

	public void setRadius(double radius) {
		Radius = radius;
	}

	public void Area() {

		double Area = PI * Radius * Radius;
		System.out.println("Area of Circle is " + Area);
	}

	@Override
	public void perimeter() {
		double Perimeter = 2 * PI * Radius;

		System.out.println("Perimeter of a circle is " + Perimeter);
	}

}

class Rectangle extends GeometricShape {

	private int length, breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void Area() {
		int Area = length * breadth;
		System.out.println("Area of rectangle is " + Area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		int Perimeter = 2 * length * breadth;
		System.out.println("Perimeter of rectangle is " + Perimeter);

	}

}

class Triangle extends GeometricShape {

	private double base, height, side1, side2;
	final double A = 0.5;

	public Triangle(double base, double height, double side1, double side2) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	public void Area() {
		double Area = A * base * height;
		System.out.println("Area of a triangle is " + Area);

	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub

		double Perimeter = base + side1 + side2;
		System.out.println("Perimeter of a Triangle is " + Perimeter);
	}

}

public class TestGeometricShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("************Circle****************");
		Circle circle = new Circle();
		circle.setRadius(5);

		circle.Area();
		circle.perimeter();

		System.out.println("***************Rectangle**************");
		Rectangle rectangle = new Rectangle();
		rectangle.setBreadth(5);
		rectangle.setLength(6);
		rectangle.Area();
		rectangle.perimeter();

		System.out.println("***************Triangle**************");
		Triangle triangle = new Triangle(2, 3, 4, 5);

		triangle.Area();
		triangle.perimeter();

	}

}
