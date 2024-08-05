package Person;

public class Person {

    private String name;
    private String sex;
    private String dob;
    private String email;
    private String gender;
    private String address;
    private String contactNo;

    public Person(String name, String sex, String dob, String email, String gender, String address, String contactNo) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
