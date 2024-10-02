//3.Utilize an abstract class named Animal, featuring abstract 
//methods sound() and move(), to design concrete subclasses such as Dog, Cat, 
//and Bird that inherit from Animal
//and implement the necessary methods?

package Assignment02October;

abstract class Animal {

	public abstract void sound();

	public abstract void move();

}

class Dog extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog Runs");
	}

}

class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat Runs");
	}

}

class Bird extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Chirp");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fly in the sky");
	}

}

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();

		System.out.println("*****************DOG***********************");

		dog.sound();
		dog.move();

		System.out.println("*******************************************");

		System.out.println("*****************CAT***********************");

		cat.sound();
		cat.move();

		System.out.println("*******************************************");

		System.out.println("****************BIRD***********************");

		bird.sound();
		bird.move();

		System.out.println("*******************************************");

	}

}
