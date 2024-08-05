package Person;

public class Receptionist extends Person {

    private String assignedDepartment;

    public Receptionist(String name, String sex, String dob, String email, String gender, String address, String contactNo, String assignedDepartment) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.assignedDepartment = assignedDepartment;
    }

    public String getAssignedDepartment() {
        return assignedDepartment;
    }

    public void setAssignedDepartment(String assignedDepartment) {
        this.assignedDepartment = assignedDepartment;
    }
}
