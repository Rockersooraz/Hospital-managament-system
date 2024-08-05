package Documents;

import Person.Doctor;
import Person.Patient;

public class MedicalRecord {

    private String recordId;
    private Patient patient;
    private Doctor doctor;
    private String diagonosis;
    private String treatment;
    private String recordDate;

    public MedicalRecord(String recordId, Patient patient, Doctor doctor, String diagonosis, String treatment, String recordDate) {
        this.recordId = recordId;
        this.patient = patient;
        this.doctor = doctor;
        this.diagonosis = diagonosis;
        this.treatment = treatment;
        this.recordDate = recordDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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

    public String getDiagonosis() {
        return diagonosis;
    }

    public void setDiagonosis(String diagonosis) {
        this.diagonosis = diagonosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
}
