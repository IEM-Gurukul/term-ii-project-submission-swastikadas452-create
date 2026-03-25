import java.util.*;

class BookingManager {

    private ArrayList<Room> rooms = new ArrayList<>();
    private HashMap<Integer, Customer> customers = new HashMap<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    // FOR ROOM 

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findRoom(int roomNumber) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber) {
                return r;
            }
        }
        return null;
    }

    // FOR CUSTOMER 

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void showAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        System.out.println("===== Customers =====");
        for (Customer c : customers.values()) {
            System.out.println(c.getId() + " - " + c.getName());
        }
    }

    // FOR BOOKING 

    //  Prevent double booking
    public boolean isRoomAvailable(int roomNumber) {
        for (Booking b : bookings) {
            if (b.getRoom().getRoomNumber() == roomNumber) {
                return false;
            }
        }
        return true;
    }

    //  Book room with validation
    public void bookRoom(int bookingId, int customerId, int roomNumber) {

        Customer customer = getCustomer(customerId);
        Room room = findRoom(roomNumber);

        //  Invalid booking
        if (customer == null || room == null) {
            System.out.println(" Invalid booking! Customer or Room not found.");
            return;
        }

        //  Double booking prevention
        if (!isRoomAvailable(roomNumber)) {
            System.out.println(" Room already booked!");
            return;
        }

        Booking booking = new Booking(bookingId, customer, room);
        bookings.add(booking);

        System.out.println(" Booking successful!");
    }

    // Show all bookings
    public void showAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.println("===== All Bookings =====");

        for (Booking b : bookings) {
            System.out.println("Booking ID: " + b.getBookingId());
            System.out.println("Customer: " + b.getCustomer().getName());
            System.out.println("Room: " + b.getRoom().getRoomNumber() + 
                               " (" + b.getRoom().getRoomType() + ")");
            System.out.println("----------------------");
        }
    }

    // Cancel booking
    public void cancelBooking(int bookingId) {
        Iterator<Booking> it = bookings.iterator();

        while (it.hasNext()) {
            Booking b = it.next();
            if (b.getBookingId() == bookingId) {
                it.remove();
                System.out.println(" Booking cancelled!");
                return;
            }
        }

        System.out.println(" Booking not found!");
    }
}