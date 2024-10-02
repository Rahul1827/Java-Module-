package Inheritance;

public class Mobile {
	
	
	protected  String compName;
	protected int modelNo;
	protected String color;
	protected String battery;
	protected String sim;
	protected double price;
	
	
	
	
	public Mobile(String compName, int modelNo, String color, String battery, String sim, double price) {
		super();
		this.compName = compName;
		this.modelNo = modelNo;
		this.color = color;
		this.battery = battery;
		this.sim = sim;
		this.price = price;
	}
	
	
	public void display()

	{
		
		System.out.println("Display the Features of Mobile");
	}


	@Override
	public String toString() {
		return "Mobile [compName=" + compName + ", modelNo=" + modelNo + ", color=" + color + ", battery=" + battery
				+ ", sim=" + sim + ", price=" + price + "]";
	}
	

}
