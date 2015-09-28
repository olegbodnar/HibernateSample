package entity;


public class Friends {
    private int ID;
    private String firstName;
    private  String lastName;
    private String role;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Friends(String firstName, String lastName, String role) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
}
