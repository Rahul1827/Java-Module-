package InerfaceDemo;

public class Circle implements Graphic{
	
	private float radius;
	
	

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	
	public float area() {
		// TODO Auto-generated method stub
		return (PI*radius*radius);
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

}
