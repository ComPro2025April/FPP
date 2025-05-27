package lab2.prog2_1;

public class Customer {
    String firstName;
    String lastName;
    String socSecurityNum;
    Address billingAddress;
    Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public Customer(String firstName, String lastName, String socSecurityNum, Address billingAddress, Address shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", ssn:"+ socSecurityNum+"]";
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }
}
