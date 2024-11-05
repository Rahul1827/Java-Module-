package Entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Appointment {

	ArrayList<AppointmentRecord> appointments = new ArrayList<AppointmentRecord>();
	Hospital hospital;
	final String logFile = "D:\\\\logfile.txt";

	public Appointment(Hospital hospital) {
		super();
		this.hospital = hospital;

	}

	void logAppointmentDetails(String message) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true));
		writer.write(message);
		writer.newLine();
	}

	public void scheduledAppoinments(String patientID, String doctorID, String appointmentId, LocalDate date) {
		Doctor doctor = hospital.getDoctorId(doctorID);
		Patient patient = hospital.getPatientId(patientID);

		if (doctor.isAvailable() == true) {
			AppointmentRecord appointmentRecord = new AppointmentRecord(patientID, doctorID, appointmentId, date);
			appointments.add(appointmentRecord);
			doctor.setAvailable(false);

		} else {

			System.out.println("Appointment not available");

		}

	}

	public void cancelAppointment(String AppointmentId) {
		if (appointments.contains(AppointmentId)) {
			appointments.remove(AppointmentId);
			System.out.println("Appointment Cancelled");

		} else {
			System.out.println("Doctor Not available");

		}

	}
	
	ArrayList<AppointmentRecord> displayAppointmentsByPatient(String patientId) {
        ArrayList<AppointmentRecord> patientAppointments = new ArrayList<AppointmentRecord>();
        for (AppointmentRecord appointment : appointments) {
            if (appointment.getPatientId().equals(patientId)) {
                patientAppointments.add(appointment);
            }
        }
        return patientAppointments;
    }

}
