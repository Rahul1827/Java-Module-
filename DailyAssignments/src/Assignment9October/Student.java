package Assignment9October;

public class Student {
	int  rollNo;
	 Name name ;
	 Address address;
	
	
	public Student(int rollNo, Name name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
	
		public void display()
		{
			
			System.out.println("Name is "+name);
			System.out.println("City is "+address.city+ "and State is "+address.state+ "and Countrty is "+address.Country);
		
			
			
		
		
		
	}
}
