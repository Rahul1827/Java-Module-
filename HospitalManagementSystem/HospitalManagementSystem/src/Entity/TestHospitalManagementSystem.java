package Entity;

import java.util.Scanner;

public class TestHospitalManagementSystem {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);
        
        String ch;
        do {
            System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("\n====== Hospital Management System =======");
            System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Remove Doctor");
            System.out.println("5. Update Patient");
            System.out.println("6. Update Doctor");
            System.out.println("7. Search Patient");
            System.out.println("8. Search Doctor");
            System.out.println("9. Display All Patients");
            System.out.println("10. Display All Doctors");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: {
//                    System.out.println("Enter the Patient Id");
//                    String id = sc.next();
                    System.out.println("Enter the patient name");
                    String PatientName = sc.next();
                    System.out.println("Enter the patient age");
                    int age = sc.nextInt();
                    System.out.println("Enter the patient gender");
                    String gender = sc.next();
                    System.out.println("Enter the patient contactNumber");
                    String contactNumber = sc.next();
                    Patient patient = new Patient(PatientName, age, gender, contactNumber);
                    hospital.addPatient(patient);
                    System.out.println("Patient Added Successfully");
                    break;
                }
                
                case 2: {
                    System.out.println("Enter the patient id");
                    String Patientid = sc.next();
                    hospital.removePatient(Patientid);
                    System.out.println("Patient removed Successfully: " + Patientid);
                    break;
                }
                
                case 3: {
//                    System.out.println("Enter the doctor id");
//                    String id = sc.next();
                    System.out.println("Enter the doctor Name");
                    String doctorName = sc.next();
                    System.out.println("Enter the doctor specialization");
                    String doctorspecialization = sc.next();
                    System.out.println("Enter the doctor contactNumber");
                    String contactNumber = sc.next();
                    Doctor d = new Doctor(doctorName, doctorspecialization, contactNumber, false);
                    hospital.addDoctor(d);
                    break;
                }
                
                case 4: {
                    System.out.println("Enter the doctor id");
                    String doctorid = sc.next();
                    hospital.removeDoctor(doctorid);
                    System.out.println("Doctor Details Removed Successfully");
                    break;
                }
                
                case 5: {
                    System.out.println("Enter the patient id to update details");
                    String Patientid = sc.next();
                    System.out.println("Enter the patient name");
                    String PatientName = sc.next();
                    System.out.println("Enter the patient age");
                    int age = sc.nextInt();
                    System.out.println("Enter the patient gender");
                    String gender = sc.next();
                    System.out.println("Enter the patient contactNumber");
                    String contactNumber = sc.next();
                    Patient patient = new Patient( PatientName, age, gender, contactNumber);
                    hospital.updatePatient(Patientid, patient);
                    break;
                }
                
                case 6: {
                    System.out.println("Enter the doctor id to update details");
                    String doctorid = sc.next();
                    System.out.println("Enter the doctor Name");
                    String doctorName = sc.next();
                    System.out.println("Enter the doctor specialization");
                    String doctorSpecilisation = sc.next();
                    System.out.println("Enter doctor contactNumber");
                    String contactNumber = sc.next();
                    Doctor d = new Doctor( doctorName, doctorSpecilisation, contactNumber, false);
                    hospital.updateDoctor(doctorid, d);
                    break;
                }
                
                case 7: {
                    System.out.println("Enter Patient Id to search");
                    String patientId = sc.next();
                    hospital.getPatientId(patientId);
                    break;
                }

                case 8: {
                    System.out.println("Enter Doctor Id to search");
                    String doctorId = sc.next();
                    hospital.getDoctorId(doctorId);
                    break;
                }
                
                case 9: {
                    System.out.println("Details of all the patients");
                    hospital.displayAllPatient();
                    break;
                }
                
                case 10: {
                    System.out.println("Display all the Doctors");
                    hospital.displayAllDoctor();
                    break;
                }
                
                case 0: {
                    System.out.println("Exiting...");
                    break;
                }
                
                default: {
                    System.out.println("Invalid choice, please try again.");
                    break;
                }
            }

            System.out.println("Do you want to continue? (Yes or No)");
            ch = sc.next();

        } while (ch.equalsIgnoreCase("Yes"));
        
        System.out.println("********* Have A Good Day ***********");
        sc.close();
    }
}
