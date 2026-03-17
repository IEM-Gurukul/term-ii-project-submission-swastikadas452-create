class Customer {
    private int customerId;
    private String name;

    // Constructor
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    // Display customer details
    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
    }
}