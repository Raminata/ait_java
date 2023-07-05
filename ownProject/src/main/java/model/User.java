package model;

public class User {
    boolean isMale;
    boolean isFemale;
    String firstName;
    String lastName;
    String email;
    String password;

    public boolean isMale() {
        return isMale;
    }

    public User setMale(boolean male) {
        isMale = male;
        return this;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public User setFemale(boolean female) {
        isFemale = female;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
