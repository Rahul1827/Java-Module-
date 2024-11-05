package Entity;

public class Doctor {
	static int id=2000;
	String doctorId;
	String doctorName;
	String specialization;
	String contactNumber;
	boolean isAvailable;
	
	
	public Doctor( String doctorName, String specialization, String contactNumber,
			boolean isAvailable) {
		super();
		this.doctorId="did"+  ++id;
//		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
		this.isAvailable = isAvailable;
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Doctor.id = id;
	}


	public String getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", contactNumber=" + contactNumber + ", isAvailable=" + isAvailable + "]";
	}
	
	
	

}
