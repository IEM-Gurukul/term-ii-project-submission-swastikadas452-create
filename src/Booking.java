class Booking {
    private Room room;
    private Customer customer;

    // Constructor
    public Booking(Room room, Customer customer) {
        this.room = room;
        this.customer = customer;
    }

    // Confirm booking
    public void confirmBooking() {
        if (room.isAvailable()) {
            room.bookRoom();
            System.out.println("Booking confirmed for " + customer.getName());
        } else {
            System.out.println("Room is not available.");
        }
    }

    // Display booking details
    public void displayBooking() {
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Customer Name: " + customer.getName());
    }
}