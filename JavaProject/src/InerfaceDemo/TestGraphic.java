package InerfaceDemo;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle=new Circle(5);
		circle.area();
		circle.perimeter();
		
		
		System.out.println("Area of a circle is "+circle.area());
		System.out.println("Perimeter of a Circle is "+circle.perimeter());
		
		System.out.println("*****************************************");
		
		Rectangle rectangle=new Rectangle(05, 04);
		rectangle.area();
		rectangle.perimeter();
		
		
		System.out.println("Area of a rectangleis  is "+rectangle.area());
		System.out.println("Perimeter of a rectangle is "+rectangle.perimeter());

	}

}
