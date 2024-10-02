//Create classes for a Car and an Engine. The Car class should contain an 
//instance of the Engine class. 
//Implement methods to start and stop the car, and display engine details.

package Assignment02October;

class Engine {
	private String type;

	public Engine(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

class Car {
	private Engine engine;
	private boolean isRunning;

	public Car(Engine engine) {
		this.engine = engine;
		this.isRunning = false;
	}

	public void start() {
		isRunning = true;
		System.out.println("Car started.");
	}

	public void stop() {
		isRunning = false;
		System.out.println("Car stopped.");
	}

	public void displayEngineDetails() {
		System.out.println("Engine Type: " + engine.getType());
	}
}

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine = new Engine("4Stroke");
		Car car = new Car(engine);

		
		car.displayEngineDetails();
		car.start();
		car.stop();
		

	}

}
