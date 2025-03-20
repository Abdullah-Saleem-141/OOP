public class Customer {
    private int customerId;
    private String name, phoneNumber, email;

    public Customer(int customerId, String name, String phoneNumber, String email) {
  this.customerId = customerId;
  this.name = name;
  this.phoneNumber = phoneNumber;
  this.email = email;
    }

  public void displayCustomer() {
  System.out.println("Customer ID: " + customerId + " | Name: " + name);
    }
}
