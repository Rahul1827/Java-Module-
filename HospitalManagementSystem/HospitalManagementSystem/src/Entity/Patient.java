package Entity;

public class Patient {

	static int id = 1000;
	String patientId;
	String patientName;
	int age;
	String gender;
	String contactNumber;
//	public Patient( String patientName, int age, String gender, String contactNumber) {
//		super();
//		this.patientId="pid"+  ++id;
//		//this.patientId = patientId;
//		this.patientName = patientName;
//		this.age = age;
//		this.gender = gender;
//		this.contactNumber = contactNumber;
//	}

	public Patient(String patientName, int age, String gender, String contactNumber) {
		super();
		this.patientId = "pid" + ++id;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Patient.id = id;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", contactNumber=" + contactNumber + "]";
	}

}
