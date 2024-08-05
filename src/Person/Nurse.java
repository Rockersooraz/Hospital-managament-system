package Person;

public class Nurse extends Person {

    private String assignedDepartment;
    private String assignedPatients;

    public Nurse(String name, String sex, String dob, String email, String gender, String address, String contactNo, String assignedDepartment, String assignedPatients) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.assignedDepartment = assignedDepartment;
        this.assignedPatients = assignedPatients;
    }

    public String getAssignedDepartment() {
        return assignedDepartment;
    }

    public void setAssignedDepartment(String assignedDepartment) {
        this.assignedDepartment = assignedDepartment;
    }

    public String getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(String assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    public void assistDoctor(){

    }
}
