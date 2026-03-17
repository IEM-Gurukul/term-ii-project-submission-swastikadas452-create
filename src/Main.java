import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookingManager manager = new BookingManager();

        // Sample Rooms
        manager.addRoom(new Room(101, "Standard"));
        manager.addRoom(new Room(102, "Deluxe"));
        manager.addRoom(new Room(103, "Premium"));

        // Sample Customers
        manager.addCustomer(new Customer(1, "Swastika", "9876543210", "swastika@gmail.com"));
        manager.addCustomer(new Customer(2, "User2", "9123456780", "user2@gmail.com"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Hotel Booking System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.showAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    manager.bookRoom(roomNo, custId);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}