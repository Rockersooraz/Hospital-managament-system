package Person;
import Documents.Prescription;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {


    private String medicalHistory;
    private String insuranceDetails;
    private List<Prescription> prescriptions;


    public Patient(String id,String name, String dob, String email, String gender, String address, String contactNo, String medicalHistory, String insuranceDetails) {
        super(id, name, dob, email, gender, address, contactNo);
        this.medicalHistory = medicalHistory;
        this.insuranceDetails = insuranceDetails;
        this.prescriptions = new ArrayList<>();
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Prescription prescriptions) {
        this.prescriptions.add(prescriptions);
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID" + getId() );
        System.out.println("Patient Name" + getName() );
        System.out.println("Patient ID" + getEmail());
        System.out.println("Patient Gender" + getGender());
    }

}










