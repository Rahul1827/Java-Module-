package Assignment9October;

public class Address {
	 String city;
	 String state;
	String Country;
	
	
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		Country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}
	
	
	
}
