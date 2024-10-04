package InerfaceDemo;

public class Rectangle implements Graphic{
	
	private float length, breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 2*length+breadth;
	}
	
	

}
