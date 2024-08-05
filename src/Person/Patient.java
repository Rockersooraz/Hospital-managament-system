package Person;

public class Patient extends Person {


    private String medicalHistory;
    private String insuranceDetails;
    private String prescriptions;


    public Patient(String name, String sex, String dob, String email, String gender, String address, String contactNo, String medicalHistory, String insuranceDetails, String prescriptions) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.medicalHistory = medicalHistory;
        this.insuranceDetails = insuranceDetails;
        this.prescriptions = prescriptions;
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

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

}










