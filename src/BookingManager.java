import java.util.*;

class BookingManager {
    private ArrayList<Room> rooms = new ArrayList<>();
    private HashMap<Integer, Customer> customers = new HashMap<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void showAvailableRooms() {
        for (Room r : rooms) {
            if (r.isAvailable()) r.displayRoom();
        }
    }

    public void bookRoom(int roomNo, int custId) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNo) {
                if (r.isAvailable()) {
                    r.bookRoom();
                    System.out.println("Booked for " + customers.get(custId).getName());
                } else {
                    System.out.println("Room already booked");
                }
            }
        }
    }
}