package Person;

public class Person {

    private String id;
    private String name;
    private String dob;
    private String email;
    private String gender;
    private String address;
    private String contactNo;

    public Person(String id, String name, String dob, String email, String gender, String address, String contactNo) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public void displayDetails() {
        System.out.println("Person ID" + this.id );
        System.out.println("Person Name" + this.name );
        System.out.println("Person ID" + this.email);
        System.out.println("Person Gender" + this.gender);
    }
}
