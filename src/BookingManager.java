import java.util.*;

class BookingManager {
    private ArrayList<Room> rooms;
    private HashMap<Integer, Customer> customers;

    // Constructor
    public BookingManager() {
        rooms = new ArrayList<>();
        customers = new HashMap<>();
    }

    // Add room
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Add customer
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    // Show available rooms
    public void showAvailableRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.displayRoom();
            }
        }
    }

    // Book room
    public void bookRoom(int roomNumber, int customerId) {
        Room selectedRoom = null;

        // Find room
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                selectedRoom = room;
                break;
            }
        }

        if (selectedRoom == null) {
            System.out.println("Room not found.");
            return;
        }

        if (!customers.containsKey(customerId)) {
            System.out.println("Customer not found.");
            return;
        }

        if (selectedRoom.isAvailable()) {
            selectedRoom.bookRoom();
            System.out.println("Booking successful for " + customers.get(customerId).getName());
        } else {
            System.out.println("Room already booked.");
        }
    }

    // ✅ UPDATE CUSTOMER (IMPORTANT)
    public void updateCustomer(int customerId, String name, String phone, String email) {
        if (customers.containsKey(customerId)) {
            Customer c = customers.get(customerId);

            c.setName(name);
            c.setPhoneNumber(phone);
            c.setEmail(email);

            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }
}