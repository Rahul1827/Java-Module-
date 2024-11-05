package Entity;

import java.time.LocalDate;

public class AppointmentRecord {
	
	 String   patientId;
     String   doctorId;
       String appointmentId;
      LocalDate  appointmentDate;
      
public AppointmentRecord() {
	// TODO Auto-generated constructor stub
}      
      
	public AppointmentRecord(String patientId, String doctorId, String appointmentId, LocalDate appointmentDate) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "AppointmentRecord [patientId=" + patientId + ", doctorId=" + doctorId + ", appointmentId="
				+ appointmentId + ", appointmentDate=" + appointmentDate + "]";
	}
      
      
	

}
