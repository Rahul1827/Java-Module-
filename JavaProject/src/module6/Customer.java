package module6;

public class Customer {

	private int custId;
	private String name;
	private String mobNo;
	private String Address;
	
	
	
	public Customer() {
	
		custId=101;
		name="Unknown";
		mobNo="8754213254";
		Address="21 sec-b xyz";
		
		
		
		
		
	}



	public Customer(int custId, String name, String mobNo, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobNo = mobNo;
		this.Address = address;
	}



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobNo() {
		return mobNo;
	}



	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobNo=" + mobNo + ", Address=" + Address + "]";
	}
	

		
	}
	
	

