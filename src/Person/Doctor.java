package Person;

public class Doctor extends Person {

    private String specialization;
    private String department;
    private String type;

    public Doctor(String name, String sex, String dob, String email, String gender, String address, String contactNo, String doctorId, String speciality, String department, String type) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.specialization = speciality;
        this.department = department;
        this.type = type;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}