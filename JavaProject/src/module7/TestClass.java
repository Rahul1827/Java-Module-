package module7;

class Stream
{
	
private String type;
private int fees;
private int noOfStudents;


public Stream(String type, int fees, int noOfStudents) {
	super();
	this.type = type;
	this.fees = fees;
	this.noOfStudents = noOfStudents;
}
@Override
public String toString() {
	return "Stream [type=" + type + ", fees=" + fees + ", noOfStudents=" + noOfStudents + "]";
}





}

class College {

	private String name;
	private char grade;
	private String address;
	private String contactNo;

	public College(String name, char grade, String address, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "college [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College college= new College("MET", 'A', "Nashik", "7845123654");
		
		Stream stream1 = new Stream("CS", 100000, 120);
		Stream stream2= new Stream("EC", 50000, 160);
		Stream stream3= new Stream("IT", 120000, 80);
		Stream stream4 = new Stream("ME", 10000, 180);
		Stream stream5 = new Stream("Civil", 115000, 120);
		
		
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
		System.out.println(stream4);
		System.out.println(stream5);
		
		
	}

}
