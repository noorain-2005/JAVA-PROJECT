public class Customer {

    String name;
    int accNumber;

    public Customer(String name, int accNumber) {
        this.name = name;
        this.accNumber = accNumber;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accNumber);
    }
}