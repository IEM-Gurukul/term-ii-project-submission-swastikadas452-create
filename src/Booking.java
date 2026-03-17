class Booking {
    private Room room;
    private Customer customer;

    public Booking(Room room, Customer customer) {
        this.room = room;
        this.customer = customer;
    }

    public void confirmBooking() {
        if (room.isAvailable()) {
            room.bookRoom();
            System.out.println("Booking confirmed for " + customer.getName());
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void displayBooking() {
        System.out.println("Room: " + room.getRoomNumber() + " (" + room.getRoomType() + ")");
        System.out.println("Customer: " + customer.getName());
    }
}