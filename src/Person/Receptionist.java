package Person;

public class Receptionist extends Person {

    private String assignedDepartment;

    public Receptionist(String id,String name, String dob, String email, String gender, String address, String contactNo, String assignedDepartment) {
        super(id, name, dob, email, gender, address, contactNo);
        this.assignedDepartment = assignedDepartment;
    }

    public String getAssignedDepartment() {
        return assignedDepartment;
    }

    public void setAssignedDepartment(String assignedDepartment) {
        this.assignedDepartment = assignedDepartment;
    }
}
