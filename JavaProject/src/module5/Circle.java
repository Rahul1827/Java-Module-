package module5;

import java.util.Scanner;

public class Circle {

	private double radius;
	private double area1;
	private double peri;
	static double PI ;
	
	static {
		
		PI=3.14;
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {

		System.out.println("Enter the radius");
		radius = sc.nextDouble();
		System.out.println("Enter the Area");
		area1 = sc.nextDouble();
		System.out.println("Enter the Perimeter");
		peri = sc.nextDouble();

	}

	public void display() {

		System.out.println("Radius of a circle is =" + radius);
		System.out.println("Area of a circle is =" + area1);
		System.out.println("Perimeter of a circle is =" + peri);
	}

	public void calPeri() {

		peri = 2 * PI * radius;

	}

	public void calArea() {

		area1 = PI * radius * radius;

	}

}