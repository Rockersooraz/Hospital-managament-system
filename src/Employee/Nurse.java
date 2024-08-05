package Employee;

public class Nurse extends Employee{

    private String departments;
    private String shift;

    public Nurse(String name, String sex, String dob, String email, String gender, String address, String contactNo, String departments, String shift) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.departments = departments;
        this.shift = shift;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void assistDoctor(){

    }
}
