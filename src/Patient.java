public class Patient {

    private String patientId;
    private String name;
    private String sex;
    private String dob;
    private String email;
    private String gender;
    private String address;
    private String contactNo;


    public Patient(String patientId, String name, String sex, String dob, String email, String gender, String address, String contactNo) {
        this.patientId = patientId;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
