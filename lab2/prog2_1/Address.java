package lab2.prog2_1;

public class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String zip;

    public Address(String str, String cit, String st, String z) {
        street = str;
        city = cit;
        state = st;
        zip = z;
    }
    public String toString() {
        return street + ", " + city + ", "+ state + " " + zip;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
}
