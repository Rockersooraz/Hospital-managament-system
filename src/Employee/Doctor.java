package Employee;

public class Doctor extends Employee {

    private String doctorId;
    private String speciality;
    private String department;
    private String type;

    public Doctor(String name, String sex, String dob, String email, String gender, String address, String contactNo, String doctorId, String speciality, String department, String type) {
        super(name, sex, dob, email, gender, address, contactNo);
        this.doctorId = doctorId;
        this.speciality = speciality;
        this.department = department;
        this.type = type;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
