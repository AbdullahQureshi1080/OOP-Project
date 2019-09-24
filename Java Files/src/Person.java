import java.io.Serializable;

public class Person implements Serializable {
    protected String firstname;
    protected String lastname;
    protected String mobileNo;
    protected String email;
    protected String password;
    protected Address address;

    public Person() {
    }

    public Person(String firstname, String lastname, String mobileNo,String email, String password, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
