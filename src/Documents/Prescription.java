package Documents;

import Person.Doctor;
import Person.Patient;

public class Prescription {

    private String prescriptionId;
    private Patient patient;
    private Doctor doctor;
    private String medicine;
    private String issueDate;

    public Prescription(String prescriptionId, Patient patient, Doctor doctor, String medicine, String issueDate) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.issueDate = issueDate;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}


