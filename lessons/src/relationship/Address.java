package relationship;

public class Address {
    String city;
    String street;
    int houseNumber;
    String country;

    public Address(String city, String street, int houseNumber, String country) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", country='" + country + '\'' +
                '}';
    }
}
