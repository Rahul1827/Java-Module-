package Entity;

import java.util.HashMap;

public class Hospital {

	HashMap<String, Patient> patients=new HashMap<String, Patient>();
	HashMap<String, Doctor> doctors = new HashMap<String, Doctor>();

	// patient

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientId(), patient);

	}

	public void removePatient(String patientId) {
		patients.remove(patientId);

	}

	public void updatePatient(String patientId, Patient p) {
		patients.replace(patientId, p);

	}

	public void displayAllPatient() {
		if (patients.isEmpty()) {
			System.out.println("No details found");
		} else {
			for (Patient p : patients.values()) {
				System.out.println("Patient ID: " + p.getPatientId() + "\nPatient Name: " + p.getPatientName()
						+ "\nPatient age: " + p.getAge() + "\nPatient Gender: " + p.getGender()
						+ "\nPatient ContactNo: " + p.getContactNumber());
			}
		}
	}
	
//	public void displayAllPatients()
//	{
//		for(Patient p:patients.values())
//		{
//			System.out.println(p);
//			
//		}
//		
//	}
	
	public Patient getPatientId(String patientId)
	{
		
		return patients.get(patientId);
	}
	
	
	
	//Doctor
	
	public Doctor getDoctorId(String doctorId)
	{
		
		return doctors.get(doctorId);
	}

	
	public void addDoctor(Doctor doctor) {
		doctors.put(doctor.getDoctorId(), doctor);

	}
	
	public void removeDoctor(String docterId) {
		doctors.remove(docterId);

	}
	
	public void updateDoctor(String doctorId, Doctor d) {
		doctors.replace(doctorId, d);
	

	}
	

//	public void displayAllDoctors()
//	{
//		for(Doctor d:doctors.values())
//		{
//			System.out.println(d);
//			
//		}
//		
//	}
	
	public void displayAllDoctor() {
		if (doctors.isEmpty()) {
			System.out.println("No details found");
		} else {
			for (Doctor d : doctors.values()) {
				System.out.println("Patient ID: " + d.getDoctorId() + "\nDoctor Name: " + d.getDoctorName()
						+ "\nDoctor specialization: " + d.getSpecialization() + "\nDoctor Contact Number: " + d.getContactNumber());
			}
		}
	}
	
	
	
}
