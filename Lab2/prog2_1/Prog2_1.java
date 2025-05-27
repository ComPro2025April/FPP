package Lab2.prog2_1;

public class Prog2_1 {
    public static void main(String[] args) {
        Address add1A = new Address("10 Adams", "Chicago", "IA", "52556");
        Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
        Address add2A = new Address("322 Harrison", "Fairfield", "IA", "52556");
        Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");

        Customer customer = new Customer("John", "Smith", "1234", add1A, add1B);
        Customer customer2 = new Customer("Oumar", "Kshitij", "456", add2A, add2B);

        Customer[] customers = {customer, customer2};

        for (Customer c : customers) {
            if (c.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(c.toString());
                System.out.println("Shipping address:" + c.getShippingAddress().toString());
                System.out.println("Billing address:" + c.getBillingAddress().toString());
            }
        }
    }
}
