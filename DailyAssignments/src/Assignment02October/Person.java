//1.    Create an immutable class called Person with final fields for name and age. Provide a constructor to initialize these fields,
//and make sure that once the object is created, the values cannot be changed.

package Assignment02October;

public class Person {

	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Person person = new Person("Alice", 30);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		

	}
}
